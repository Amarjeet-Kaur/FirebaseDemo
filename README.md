<h1>Firebase Demo</h1>
<h5>This app provides the functionality to fetch data from Firebase which  is a real-time Database.</h5>

<h4>What is Firebase?</h4>
Firebase is Google's mobile platform that helps you quickly develop high-quality apps and grow your business. 
Firebase Realtime Database
Store and sync data with our NoSQL cloud database. Data is synced across all clients in realtime, and remains available when your app goes offline.
The Firebase Realtime Database is a cloud-hosted database. Data is stored as JSON and synchronized in realtime to every connected client. When you build cross-platform apps with our iOS, Android, and JavaScript SDKs, all of your clients share one Realtime Database instance and automatically receive updates with the newest data.


	
<h4>Screenshots</h4><br>
<p>
<img src="https://user-images.githubusercontent.com/38749215/63515232-f6f1de80-c507-11e9-8ab4-239ac2e4ad6f.PNG" height="300px" width="600px">
<br><br><br><img src="https://user-images.githubusercontent.com/38749215/63517907-8483fd00-c50d-11e9-9ad3-fc05be6fa1ad.PNG"></p><br>
<h4>Usage</h4><br>
<p>
1. Create a project in android and register that project with firebase and download the <q><b><i>google-services.json</i></b></q> file, add that file to the android project.<br>
2. In android app, add dependency for firebase database.<br>
<blockquote>
	dependencies{<br> 
	implementation 'com.google.firebase:firebase-database:11.8.0'<br>
	}<br>
	apply plugin: 'com.google.gms.google-services'
	</blockquote><br>
3. In main class, get the reference of the database.<br>
<blockquote>
	  mMessageReference = FirebaseDatabase.getInstance().getReference();
</blockquote>
4. To fetch data from database, add child event listener.</br>
5. Add that data in recycler view.</p><br>
<p><strong>
Version: 1.0<br>
Initial Build</strong></p>

