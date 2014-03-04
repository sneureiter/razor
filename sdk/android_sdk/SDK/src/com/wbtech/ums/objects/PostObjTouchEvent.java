package com.wbtech.ums.objects;

import android.content.Context;
import android.util.Log;

import com.wbtech.ums.common.CommonUtil;

public class PostObjTouchEvent {
	
	
	private String activity;
	private String acc; //num
	private String appkey;
	private float xcoordiante;
	private float ycoordiante;
	private String object = "remove";
	private String device_id;
	private String session_id;
	private String event;
	private String time;
	private String version;
	private Context context;
	
	public PostObjTouchEvent (Context context, String acc, float xcoordinate, 
			float ycoordinate, String session_id, String event) {
		super();
        this.xcoordiante = xcoordinate;
        this.ycoordiante = ycoordinate;
        this.event = event;
        this.acc = acc;
                
        this.context = context;
        this.time = CommonUtil.getTime();
        this.activity = CommonUtil.getActivityName(context);
        this.appkey = CommonUtil.getAppKey(context);
        this.version = CommonUtil.getVersion(context);
        this.device_id = CommonUtil.getDeviceID(context);
        this.session_id = session_id; 
			
	}
	

	
    public boolean verification() {
        if (this.getAcc().contains("-") || this.getAcc() == null || this.getAcc().equals("")) {
           Log.d("test", this.getAcc());
            return false;
        } else {
            return true;
        }
    }

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public float getXcoordiante() {
		return xcoordiante;
	}

	public void setXcoordiante(float xcoordiante) {
		this.xcoordiante = xcoordiante;
	}

	public float getYcoordiante() {
		return ycoordiante;
	}

	public void setYcoordiante(float ycoordiante) {
		this.ycoordiante = ycoordiante;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acc == null) ? 0 : acc.hashCode());
		result = prime * result
				+ ((activity == null) ? 0 : activity.hashCode());
		result = prime * result + ((appkey == null) ? 0 : appkey.hashCode());
		result = prime * result + ((context == null) ? 0 : context.hashCode());
		result = prime * result
				+ ((device_id == null) ? 0 : device_id.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		result = prime * result
				+ ((session_id == null) ? 0 : session_id.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		result = prime * result + Float.floatToIntBits(xcoordiante);
		result = prime * result + Float.floatToIntBits(ycoordiante);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostObjTouchEvent other = (PostObjTouchEvent) obj;
		if (acc == null) {
			if (other.acc != null)
				return false;
		} else if (!acc.equals(other.acc))
			return false;
		if (activity == null) {
			if (other.activity != null)
				return false;
		} else if (!activity.equals(other.activity))
			return false;
		if (appkey == null) {
			if (other.appkey != null)
				return false;
		} else if (!appkey.equals(other.appkey))
			return false;
		if (context == null) {
			if (other.context != null)
				return false;
		} else if (!context.equals(other.context))
			return false;
		if (device_id == null) {
			if (other.device_id != null)
				return false;
		} else if (!device_id.equals(other.device_id))
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (session_id == null) {
			if (other.session_id != null)
				return false;
		} else if (!session_id.equals(other.session_id))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		if (Float.floatToIntBits(xcoordiante) != Float
				.floatToIntBits(other.xcoordiante))
			return false;
		if (Float.floatToIntBits(ycoordiante) != Float
				.floatToIntBits(other.ycoordiante))
			return false;
		return true;
	}
	
	

}
