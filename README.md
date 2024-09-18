# Padam Booking

<h1>PadamBooking</h1>
<p>PadamBooking is a full-stack movie ticket booking application that allows users to browse movies, select seats, and book tickets online. The project is built using modern technologies to provide a seamless and responsive user experience.</p>

<h1>Tech Stack</h1>
<h2>Frontend:</h2>
<p><b>React.js:</b> A popular JavaScript library for building dynamic and interactive user interfaces.</p>
<p><b>CSS/Bootstrap:</b> For styling and responsive design.</p>
<h2>Backend:<h2>
<p><b>Spring Boot:</b> A powerful Java framework that simplifies the development of RESTful APIs.</p>
<p><b>Java:</b> Core programming language for the backend logic.</p>
<p><b>MySQL:</b> Relational database used to store user data, movie details, and booking information.</p>
<h2>Features</h2>
<p><b>Browse Movies:</b> Users can view a list of currently available movies with details.</p>
<p><b>Search and Filter:</b> Search for movies based on different filters like genre, language, etc.</p>
<p><b>Seat Selection:</b> Interactive seat selection interface where users can choose seats.</p>
<p><b>Real-Time Availability:</b> Shows the availability of seats in real-time.</p>
<p><b>User Authentication:</b> Login and registration system for users.</p>
<p><b>Booking Confirmation:</b> After selecting a seat, users can confirm their bookings.</p>
<p><b>Payment Integration:</b> (Optional: Mention if you have implemented or plan to implement payment gateway integration.)</p>
<h2>Installation and Setup</h2>
<h3>Prerequisites:</h3>
<p>Node.js (for running React frontend)</p>
<p>Java and Spring Boot (for backend)</p>
<p>MySQL (for database)</p>
<h2>Steps:</h2>
<h3>Clone the repository:</h3>

<b>git clone</b> <a>https://github.com/vibinkumar24/PadamBooking/tree/test</a>

<h2>Backend Setup:</h2>
<p>Navigate to the backend directory.</p>
<p>Ensure you have Java and Spring Boot installed.</p>
<p>Configure the MySQL database connection in application.properties.</p>
<p>Run the Spring Boot application:</p>

<b>mvn spring-boot:run</b>

<h2>Frontend Setup:</h2>
<p>Navigate to the frontend directory.</p>
<p>Install dependencies:</p>

<b>npm install</b>
<p>Start the React application:</p>

<b>npm start</b>
<h2>Access the Application:</h2>

<p>The frontend will be available at <b>http://localhost:3000/.</b></p>
<p>The backend API will run on <b>http://localhost:8080/.</b></p>
<h2>Database Structure</h2>
<h3>Tables:</h3>
<p><b>movies:</b> Stores movie details.</p>
<p><b>theaters:</b> Stores theaters details.</p>
<p><b>screen:</b> Stores screen details.</p>
<p><b>seat:</b> Stores seat details.</p>
<p><b>show:</b> Stores show details.</p>
<p><b>bookings:</b> Stores user booking details.</p>
<p><b>users:</b> Stores user information for authentication.</p>
<h2>Future Enhancements</h2>
<p><b>Payment Integration:</b> Plan to integrate payment gateways for real-time payments.</p>
<p><b>Admin Dashboard:</b> Add an admin panel for managing movies and bookings.</p>
<p><b>Improved UI/UX:</b> Further enhancements in user interface and experience.</p>

![Home Page](./markdown/home.png)
![Theater Page](./markdown/theater.png)
![Seat Page](./markdown/seat.png)
![Ticket Page](./markdown/ticket.png)