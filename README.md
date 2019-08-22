# Firebase
Firebase Demo
This app provides the functionality to fetch data from Firebase which  is a real-time Database. 

What is Firebase?
Firebase is Google's mobile platform that helps you quickly develop high-quality apps and grow your business. 
Firebase Realtime Database
Store and sync data with our NoSQL cloud database. Data is synced across all clients in realtime, and remains available when your app goes offline.
The Firebase Realtime Database is a cloud-hosted database. Data is stored as JSON and synchronized in realtime to every connected client. When you build cross-platform apps with our iOS, Android, and JavaScript SDKs, all of your clients share one Realtime Database instance and automatically receive updates with the newest data.


	
<Screenshot>
<img src="https://user-images.githubusercontent.com/38749215/63515232-f6f1de80-c507-11e9-8ab4-239ac2e4ad6f.PNG">
	<img src="https://user-images.githubusercontent.com/38749215/63517907-8483fd00-c50d-11e9-9ad3-fc05be6fa1ad.PNG">
<p>
1. Create a project in Android and register that project with Firebase and download the  JSON File.Add that File to the Android Project</p>
<p>2. In Android App, add dependency for Firebase Database.</p>
<blockquote>
	<p>dependencies</p> {
	<p>implementation 'com.google.firebase:firebase-database:11.8.0'</p>
}<p>
	apply plugin: 'com.google.gms.google-services'</p>
	</blockquote>
	
<p>3. In main class, get the reference of the Database.</p>
<blockquote>
	  mMessageReference = FirebaseDatabase.getInstance().getReference();
	</blockquote>
<p>4. To fetch data from Database, add child event listener.</p>

<p>5. Add that data in recycler view.</p>


<p>
Version: 1.0</p>
Initial Build

