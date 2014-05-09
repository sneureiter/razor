<?php
class eventpublic extends CI_Model {
    var $event_identifier;
    var $time;
    var $activity;
    var $appkey;
    var $acc;
    var $label;
    var $version;
    var $device_identifier;
	var $session_identifier;

    function loadevent($content) {
        $this -> event_identifier = $content -> event_identifier;
        $this -> time = $content -> time;
        $this -> activity = $content -> activity;
        $this -> appkey = $content -> appkey;
        $this -> acc = isset($content -> acc) ? $content -> acc : 1;
        $this -> label = isset($content -> label) ? $content -> label : '';
        $this -> version = $content -> version;
		$this -> device_identifier = isset($content -> device_identifier) ? $content -> device_identifier : '';
		$this -> session_identifier = isset($content -> session_identifier) ? $content -> session_identifier : '';

    }

}
?>

