function login() {

    const email = document.getElementById("loginEmail").value;
    const password = document.getElementById("loginPassword").value;

    fetch("/api/users/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            email: email,
            password: password
        })
    })
    .then(response => response.text())
    .then(data => {
        document.getElementById("loginMessage").innerText = data;
    })
    .catch(error => {
        document.getElementById("loginMessage").innerText =
            "Login failed!";
    });
}


function bookTest() {

    const patientName =
        document.getElementById("patientName").value;

    const testName =
        document.getElementById("testName").value;

    const bookingDate =
        document.getElementById("bookingDate").value;

    fetch("/api/bookings", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            patientName: patientName,
            testName: testName,
            bookingDate: bookingDate
        })
    })
    .then(response => response.json())
    .then(data => {

        document.getElementById("bookingMessage").innerText =
            "Booking successful!";

    })
    .catch(error => {

        document.getElementById("bookingMessage").innerText =
            "Booking failed!";

    });
}


function getBookings() {

    fetch("/api/bookings")
        .then(response => response.json())
        .then(data => {

            let output = `
                <table border="1" width="100%">
                    <tr>
                        <th>ID</th>
                        <th>Patient</th>
                        <th>Test</th>
                        <th>Date</th>
                    </tr>
            `;

            data.forEach(booking => {

                output += `
                    <tr>
                        <td>${booking.id}</td>
                        <td>${booking.patientName}</td>
                        <td>${booking.testName}</td>
                        <td>${booking.bookingDate}</td>
                    </tr>
                `;
            });

            output += "</table>";

            document.getElementById("bookingList").innerHTML =
                output;
        })
        .catch(error => {

            document.getElementById("bookingList").innerText =
                "Unable to load bookings";

        });
}