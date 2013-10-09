
<html>
<head>
    <name>Book Library</name>
    <script type="text/javascript" src="/scripts/knockout-2.3.0.js"></script>
    <script type="text/javascript" src="/scripts/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="/scripts/jquery.validate.js"></script>

</head>
<body>
<form action='/books/update'>
    <p>你有那么多 totally have <span data-bind='text: gifts().length'>&nbsp;</span> book(s) <span data-bind='visible: isDirty()'>*</span></p>
    <table data-bind='visible: gifts().length > 0'>
        <thead>
        <tr>
            <th>Book name</th>
            <th>Price</th>
            <th />
        </tr>
        </thead>
        <tbody data-bind='foreach: gifts'>
        <tr>
            <td><input class='required' data-bind='value: name, uniqueName: true' /></td>
            <td><input class='required number' data-bind='value: price, uniqueName: true' /></td>
            <td><a href='#' data-bind='click: $root.removeGift'>Delete</a></td>
        </tr>
        </tbody>
    </table>

    <button data-bind='click: addGift'>Add Book</button>
    <button data-bind='enable: gifts().length > 0' type='submit'>Submit</button>
</form>

<script type="text/javascript">
    var GiftModel = function(gifts) {
        var self = this;
        self.gifts = ko.observableArray(gifts);
        self.isDirty=ko.observable(false);

        self.addGift = function() {
            self.gifts.push({
                name: "",
                price: ""
            });
            self.isDirty(true);
        };

        self.removeGift = function(gift) {
            self.gifts.remove(gift);
            self.isDirty(true);
        };

        self.save = function(form) {
            $.post( "/books/update", {data: ko.utils.stringifyJson(self.gifts)} , function(){
                self.isDirty(false);

            });
        };
    };


    $.get( "/books/listText", function( data ) {
        var jsonObj=eval(data);
        var viewModel=new GiftModel(jsonObj);
        ko.applyBindings(viewModel);
        $("form").validate({ submitHandler: viewModel.save });


    });



</script>

</body>
</html>