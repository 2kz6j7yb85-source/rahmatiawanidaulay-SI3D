// MENU NAVIGASI

const menu = document.querySelectorAll(".sidebar a");

menu.forEach(item => {
    item.addEventListener("click", function(e) {

        if (this.getAttribute("href") === "#logout") {
            e.preventDefault();
            alert("Anda telah memilih Sign Out.");
            return;
        }

        menu.forEach(link => {
            link.classList.remove("active");
        });

        this.classList.add("active");
    });
});


// FITUR PENCARIAN

const searchInput = document.getElementById("searchInput");

searchInput.addEventListener("input", function() {

    const keyword = this.value.toLowerCase();

    const items = document.querySelectorAll(
        ".card, .welcome"
    );

    items.forEach(item => {

        const text = item.textContent.toLowerCase();

        if (text.includes(keyword)) {
            item.style.display = "";
        } else {
            item.style.display = "none";
        }

    });

});


// TOMBOL LIHAT DOKUMEN

const documentLinks = document.querySelectorAll(".document a");

documentLinks.forEach(link => {

    link.addEventListener("click", function(e) {
        e.preventDefault();
        alert("Dokumen belum ditambahkan.");
    });

});