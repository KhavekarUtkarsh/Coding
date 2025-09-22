console.log("It is JS!");

let currentSong= new Audio();
let songs;
let currFolder;

// Funstion to convert the time from only "seconds" to "Minutes-seconds"
function secondsToMinutesSeconds(seconds){
    if(isNaN(seconds)|| seconds<0){
        return "00:00";
    }
    const minutes= Math.floor(seconds/60);
    const remainingSeconds= Math.floor(seconds%60);
    const formattedMinutes= String(minutes).padStart(2,'0');
    const formattedSeconds= String(remainingSeconds).padStart(2,'0');
    return `${formattedMinutes}:${formattedSeconds}`;
}


// Here we are using below method to get the songs because we are not using Backend.
async function getSongs(folder) {
    currFolder=folder;
    let a = await fetch(`http://127.0.0.1:5500/Web_Dev/Projects/Project-9(Spotify)/${folder}/`); // To get the Songs which are stored.
    let response = await a.text();                // It gives all songs in the TABLE form i.e. "tr", "td",etc. So we have to parse them.
    let div = document.createElement("div");      // Creates a div.
    div.innerHTML = response;
    let as = div.getElementsByTagName("a");        // It gives all "a" tags.
    let songs = [];
    for (let i = 0; i < as.length; i++) {
        const element = as[i];
        if (element.href.endsWith(".mp3")) {       // Gives "a" that ends with ".mp3"
            songs.push(element.href.split(`/${folder}/`)[1]); // Pushes the songs in array "songs". Here "split" splits the URL of the song and "[1]" gives onlt the part of the Song name and not first URL part.
        }
    }
    return songs;
}

const playMusic=(track, pause=false)=>{
    // let audio= new Audio("/Web_Dev/Projects/Project-9(Spotify)/songs/"+track);
    currentSong.src= `/Web_Dev/Projects/Project-9(Spotify)/${currFolder}/`+track;
    if(!pause){
        currentSong.play();
        play.src="svg/pause.svg";
    }
    document.querySelector(".songInfo").innerHTML=decodeURI(track);  // To decode the name of the song
    document.querySelector(".songTime").innerHTML= "00:00/00:00";
}
async function main() {
    
    // Get the list of all songs
    songs = await getSongs("songs/cs");
    console.log(songs);
    playMusic(songs[0],true)
    // This gives the list of songs in list
    let songUL = document.querySelector(".songlist").getElementsByTagName("ul")[0];
    for (const song of songs) {
        songUL.innerHTML = songUL.innerHTML + 
        `<li>
            <img class="invert" src="svg/music.svg" alt="music">
            <div class="info">
                <div>${song.replaceAll("%20", " ")}</div>
                <div>UK</div>
            </div>
            <div class="playnow">
                <span>Play Now</span>
                <img class="invert" src="svg/play.svg" alt="">
            </div>
        </li>`; 
    }
    // Attach an event listener to each song
    Array.from(document.querySelector(".songlist").getElementsByTagName("li")).forEach(e=>{
        e.addEventListener("click",element=>{
            console.log(e.querySelector(".info").firstElementChild.innerHTML);
            playMusic(e.querySelector(".info").firstElementChild.innerHTML.trim());
        })
    })
    

    // Attach an event listener to "play", "pause" & "next"
    play.addEventListener("click",()=>{
        if(currentSong.paused){
            currentSong.play();
            play.src="svg/pause.svg";
        }
        else{
            currentSong.pause();
            play.src="svg/play.svg"
        }
    })

    // Listen for timeupdate event
    currentSong.addEventListener("timeupdate",()=>{
        // console.log(currentSong.currentTime,currentSong.duration);
        document.querySelector(".songTime").innerHTML=`${secondsToMinutesSeconds(currentSong.currentTime)}/${secondsToMinutesSeconds(currentSong.duration)}`;
        document.querySelector(".circle").style.left=(currentSong.currentTime/currentSong.duration)*100+"%";
    })

    // Add an event listener to the "seekbar"
    document.querySelector(".seekbar").addEventListener("click",(e)=>{
        let percent= e.offsetX/e.target.getBoundingClientRect().width*100;
        document.querySelector(".circle").style.left=percent+"%";
        currentSong.currentTime=((currentSong.duration)*percent)/100;
        // To play the song from the particular time by clicking on the seekbar as well as to change the time of the song.
    })

    // Add an event listener for "Hamburger"
    document.querySelector(".hamburger").addEventListener("click",()=>{
        document.querySelector(".left").style.left="0";
    })

    // Add an event listener for "close"
    document.querySelector(".close").addEventListener("click",()=>{
        document.querySelector(".left").style.left="-100%";
    })
    
    // Add an event listener to the "Previous"
    previous.addEventListener("click",()=>{
        // console.log("previous clicked");
        let index= songs.indexOf(currentSong.src.split("/").slice(-1)[0]);
        if((index-1)>=0){
            playMusic(songs[index-1]);
        }
    })

    // Add an event listener to the "Next"
    next.addEventListener("click",()=>{
        // console.log("Next clicked");
        let index= songs.indexOf(currentSong.src.split("/").slice(-1)[0]);
        if((index+1)<songs.length){
            playMusic(songs[index+1]);
        }
    })

    // Add an event listener to volume
    document.querySelector(".volume").getElementsByTagName("input")[0].addEventListener("change",(e)=>{
        console.log("Setting volume to ",e.target.value,"/100");
        currentSong.volume=parseInt(e.target.value)/100;
    })
}
main();