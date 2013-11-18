
function selectServiceLink(link) {
    $("#servicesList").find(".ui-state-active").removeClass("ui-state-active");
    if (link) {
        $(link).addClass("ui-state-active");
    }
}