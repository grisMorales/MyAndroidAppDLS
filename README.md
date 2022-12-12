<h1> DLS Component Library Jetpack compose</h1>

This library allows the construction of Kotlin-based design system components.

<h3>Recommendations:</h3>
<ol>
<li>Associate source code repository before app download from VCS option:</li> 
        <li>Enable Version Control Integration</li>

<li>If you do not have a physical device, you can configure a virtual device that supports at least API 30 or higher.</li>

<li>Consider having the latest Android Studio update</li>
</ol>

<h3>Software installation</h3>
<ul>
<li>Download the repository project </li>
<li>Perform sync via Gradle (may take several minutes) </li>
<li>Add the library dependency in the Gradle file (app): (name of the library to be generated)</li>
        implementation project(path: ':mylibrary')
<li>Once this action is done, it is necessary to carry out the synchronization of the project again. </li>
<li>It is important that at the end of each change to the library it is necessary to update the file (.lib) again in the base project where it will be consumed.</li>
<li>It is possible to carry out unit tests of the modules of the library.</li>
</ul>
Enjoy coding!



