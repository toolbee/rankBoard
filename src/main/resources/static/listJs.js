/**
 * rankBoard
 * listJs
 */

<!-- Chart code -->
am4core.ready(function() {

	// Themes begin
	am4core.useTheme(am4themes_animated);
	// Themes end
	
	var chart = am4core.create("recordChart", am4charts.PieChart);
	chart.hiddenState.properties.opacity = 0; // this creates initial fade-in
	
	chart.data = [
		{
	    	record: "win",
	    	value: 3
	  	},
	  	{
	    	record: "lose",
	    	value: 2
	  	},
	];
	chart.radius = am4core.percent(70);
	chart.innerRadius = am4core.percent(40);
	chart.startAngle = 180;
	chart.endAngle = 360;  
	
	var series = chart.series.push(new am4charts.PieSeries());
	series.dataFields.value = "value";
	series.dataFields.category = "record";
	
	series.slices.template.cornerRadius = 10;
	series.slices.template.innerCornerRadius = 7;
	series.slices.template.draggable = true;
	series.slices.template.inert = true;
	series.alignLabels = false;
	
	series.hiddenState.properties.startAngle = 90;
	series.hiddenState.properties.endAngle = 90;
	
	chart.legend = new am4charts.Legend();

}); // end am4core.ready()
