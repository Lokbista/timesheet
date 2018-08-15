$(function () {
	$('[data-toggle="popover"]').popover()
})
// Call datepicker for calendars (start and end dates)
$( function() {
	$( ".date-picker" ).datepicker({
		  dateFormat: "mm/dd/yy"
	});
})