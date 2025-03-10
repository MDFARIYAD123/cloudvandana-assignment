
const images = [
    "images/image1.jpg",
    "images/image2.jpg",
    "images/image3.jpg",
];

let currentIndex = 0;
const slider = document.getElementById("slider");


function updateImage() {
    slider.src = images[currentIndex];
}


function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
}


function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
}


updateImage();
