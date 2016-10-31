ACC.checkoutsummary = {

	_autoload: [
		"bindAllButtons",
	    "bindScheduleReplenishment",
		"bindRequestQuoteForm",
		"replenishmentInit"
	],

	bindAllButtons: function()
	{
		ACC.checkoutsummary.toggleActionButtons('.place-order-form');
		
	},
	
	toggleActionButtons: function(selector) {
		
		var cssClass = $(selector);
		var checkoutBtns = cssClass.find('.checkoutSummaryButton');
		var checkBox = cssClass.find('input[name=termsCheck]')	
		
		if(checkBox.is(':checked')) {
			checkoutBtns.prop('disabled', false);
            ACC.checkoutsummary.disableQuoteButton(cssClass);
		}
		
		checkBox.on('click', function() {
			var checked = $(this).prop('checked');

			if(checked) {
				checkoutBtns.prop('disabled', false);
                ACC.checkoutsummary.disableQuoteButton(cssClass);
			} else {
				checkoutBtns.prop('disabled', true);
			}
		});
	},

    disableQuoteButton: function(cssClass) {
        if(typeof cartDataQuoteAllowed == 'undefined' || !cartDataQuoteAllowed) {
            cssClass.find('.requestQuoteButton').prop('disabled', true);
        }
    },
	
	bindScheduleReplenishment: function(data)
	{
		var form = $('#placeOrderForm1');
		var placeReplenishment = false;
		
		$(document).on("click",".scheduleReplenishmentButton",function(e){
			e.preventDefault();
			
			var termChecked = $(this).closest("form").find('input[name=termsCheck]').is(':checked');	
			form.find('input[name=termsCheck]').prop('checked', termChecked);
			
			var title = $('.scheduleReplenishmentButton').first().text().trim();
			
			ACC.colorbox.open(title,{
				href: "#replenishmentSchedule",
				inline: true,
				width:"620px",
				onComplete: function(){
					$(this).colorbox.resize();
					placeReplenishment = false;
				},
				onClosed: function() {
					
					if (placeReplenishment) {
						form.submit();
					}
					
					$(".replenishmentOrderClass").val(false);
				}
			});
			
			$("input:radio[name=replenishmentRecurrence]").click(function() {
				if ($("#replenishmentStartDate").val() != '') {
					$('#replenishmentSchedule .js-replenishment-actions').show();
				}
				switch(this.value)
				{
					case "DAILY":

						$('.scheduleformD').show();
						$('.scheduleformW').hide();
						$('.scheduleformM').hide();

						break;
					case "WEEKLY":
						$('.scheduleformD').hide();
						$('.scheduleformW').show();
						$('.scheduleformM').hide();
						break;
					default:
						$('.scheduleformD').hide();
						$('.scheduleformW').hide();
						$('.scheduleformM').show();
				};


				$.colorbox.resize();
			});
			
		});
		
		$(document).on("click",'#replenishmentSchedule #cancelReplenishmentOrder', function (e) {
			e.preventDefault();
			$(".replenishmentOrderClass").val(false);
			$.colorbox.close();
		});
		
		$(document).on("click",'#replenishmentSchedule #placeReplenishmentOrder', function (e){
			e.preventDefault();
			
			$(".replenishmentOrderClass").val(true);
			placeReplenishment = true;
			$.colorbox.close();
		});


		$(document).on("click",'#replenishmentSchedule .js-open-datepicker', function (){
			$('#replenishmentSchedule .hasDatepicker').datepicker('show');
		});

	},

	replenishmentInit: function ()
	{
		var placeOrderFormReplenishmentOrder = $('#replenishmentSchedule').data("placeOrderFormReplenishmentOrder");
		var placeOrderFormReplenishmentRecurrence = $('#replenishmentSchedule').data("placeOrderFormReplenishmentRecurrence");
		var dateForDatePicker = $('#replenishmentSchedule').data("dateForDatePicker");
		var placeOrderFormNDays = $('#replenishmentSchedule').data("placeOrderFormNDays");
		var placeOrderFormNthDayOfMonth = $('#replenishmentSchedule').data("placeOrderFormNthDayOfMonth");
		
		if (placeOrderFormReplenishmentOrder === undefined) {
			return;
		}
		
		// replenishment schedule data not set to cart yet
		if (!placeOrderFormReplenishmentOrder) {
		
			$('#replenishmentSchedule .js-replenishment-actions').hide();
		
			// default value for daily
			$("input:radio[name='replenishmentRecurrence'][value=DAILY]").prop('checked', false);
			$('.scheduleformD').hide();
			$("#nDays option[value=" + placeOrderFormNDays + "]").attr('selected', 'selected');

			// default value for weekly
			$("input:radio[name='replenishmentRecurrence'][value=WEEKLY]").prop('checked', false);
			$('.scheduleformW').hide();
		
			// default value for monthly
			$("input:radio[name='replenishmentRecurrence'][value=MONTHLY]").prop('checked', false);
			$('.scheduleformM').hide();
		
			if (placeOrderFormNthDayOfMonth != '')		
				$("#nthDayOfMonth option[value=" + placeOrderFormNthDayOfMonth + "]").attr('selected', 'selected');

			$("#replenishmentStartDate").val("");
		}
		else {
			switch(placeOrderFormReplenishmentRecurrence)
			{
				case "DAILY":
					$('.scheduleformD').show();
					break;
				case "WEEKLY":
					$('.scheduleformW').show();
					break;
				default:
					$('.scheduleformM').show();
			};

		}

		$(".js-replenishment-datepicker").datepicker({
			dateFormat: dateForDatePicker,
		    onClose: function() {
		    	if ($(this).val() == '' ) {
		    		$('#replenishmentSchedule .js-replenishment-actions').hide();
		    	}
		    	else {
		    		if ($("input:radio[name=replenishmentRecurrence]").is(':checked')) {
			        	$('#replenishmentSchedule .js-replenishment-actions').show();
                        $.colorbox.resize();
			        }
		    	}
		    		
		    }
		});	
		
	},
	
	bindRequestQuoteForm: function ()
	{
		var form = $('#placeOrderForm1');
		var placeQuote = false;
		
		$(document).on("click",".requestQuoteButton",function(e){
			e.preventDefault();
			
			var termChecked = $(this).closest("form").find('input[name=termsCheck]').is(':checked');	
			form.find('input[name=termsCheck]').prop('checked', termChecked);
			
			var title = $('.requestQuoteButton').first().text().trim();

			ACC.colorbox.open(title,{
				href: "#requestQuoteForm",
				inline: true,
				width:"620px",
				onOpen: function()
				{
					$(".requestQuoteClass").val(true);
				},
				onComplete: function(){
					$(this).colorbox.resize();
					placeQuote = false;
				},
				onClosed: function() {
					
					if (placeQuote) {
						form.submit();
					}

					$(".requestQuoteClass").val(false);
					$('#requestQuoteForm #placeRequestQuote').prop('disabled', true);
				}
			});
			
		});
		
		$(document).on("click",'#requestQuoteForm #cancelRequestQuote', function (e) {
			e.preventDefault();
			$.colorbox.close();
		});
		
		$('#quoteRequestDescription').keyup(function() {
			
			// enable the request quote button
			$('#requestQuoteForm #placeRequestQuote').prop('disabled', this.value == "" ? true : false);  		
			
			// limit the text length 
			var maxchars = 255;
			
			var tlength = $(this).val().length;
			$(this).val($(this).val().substring(0, maxchars));
			var tlength = $(this).val().length;
			remain = maxchars - parseInt(tlength);
			$('#quoteRequestDescription').text(remain);
		});
		
		$(document).on("click",'#requestQuoteForm #placeRequestQuote', function (e) {
			e.preventDefault();
			placeQuote = true;
			$.colorbox.close();
		});
	}

};
