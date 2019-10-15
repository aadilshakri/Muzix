
<html>

<head>
<!-- <meta content = "text/html ; charset=UTF-8"> -->
<title>Muzix</title>
</head>
<body>
    <h3>Muzix</h3>

    <h4>Add Track</h4>
    <form action="addTrack" method="post">
        <p>TrackId</p>
        <input type="text" name="trackId" />
        <p>TrackName</p>
        <input type="text" name="trackName" />
        <p>Comments</p>
        <input type="text" name="Comments" />
        <input type="submit" value="Add Track" />
    </form>

    <h4>Display Track by TrackId</h4>
    <form action="displayTrackById" method="post">
            <p>TrackId</p>
            <input type="text" name="trackId" />
            <input type="submit" value="Display Track" />
    </form>

    <h4>Display Track by TrackName</h4>
    <form action="displayTrackByName" method="post">
            <p>TrackName</p>
            <input type="text" name="trackName" />
            <input type="submit" value="Display Track" />
    </form>

    <h4>Update Track</h4>
    <form action="updateComment" method="post">
        <p>TrackId</p>
        <input type="text" name="trackId" />
        <p>New Comment</p>
        <input type="text" name="comment" />
        <input type="submit" value="Update Comment" />
    </form>

    <h4>Remove Track</h4>
    <form action="removeTrack" method="post">
        <p>TrackId</p>
        <input type="text" name="trackId" />
        <input type="submit" value="Remove Track" />
    </form>
</body>

</html>