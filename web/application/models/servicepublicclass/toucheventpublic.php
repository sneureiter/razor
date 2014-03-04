<?php
class toucheventpublic extends CI_Model {
    var $time;
    var $activity;
    var $appkey;
    var $acc;
    var $xcoordinate;
    var $ycoordinate;
    var $object;
    var $device_identifier;
	var $session_identifier;

    function loadtouchevent($content) {
        $this -> time = $content -> time;
        $this -> activity = $content -> activity;
        $this -> appkey = $content -> appkey;
        $this -> acc = isset($content -> acc) ? $content -> acc : 1;
        $this -> xcoordinate = isset($content -> xcoordinate) ? $content -> xcoordinate : '';
        $this -> ycoordinate = isset($content -> ycoordinate) ? $content -> ycoordinate : '';
		$this -> device_identifier = isset($content -> device_identifier) ? $content -> device_identifier : '';
		$this -> session_identifier = isset($content -> session_identifier) ? $content -> session_identifier : '';
		$this -> event = "test";# isset($content -> event) ? $content -> event : '';

    }

}
?>