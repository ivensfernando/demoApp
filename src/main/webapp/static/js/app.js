function checkTask(id){
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == XMLHttpRequest.DONE) {
            location.reload();
        }
    }
    xhr.open('GET', window.location.origin+'/demoApp/check-task-'+id, true);
    xhr.send(null);
}