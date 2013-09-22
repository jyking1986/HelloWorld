(function($){

    $.get( "/test", function( data ) {
        var jsonData=eval(data);

        $.ajax({
            url:         "/test",
            type:        "POST",
            data:        JSON.stringify(jsonData),
            contentType: "application/json; charset=utf-8",
            dataType:    "json",
            success:     function(data, textStatus, jqXHR){

            }
        })


    });

    $.get( "/test/list", function( data ) {
        var jsonData=eval(data);

        $.ajax({
            url:         "/test/list",
            type:        "POST",
            data:        JSON.stringify(jsonData),
            contentType: "application/json; charset=utf-8",
            dataType:    "json",
            success:     function(data, textStatus, jqXHR){

            }
        })


    });

})(jQuery);
