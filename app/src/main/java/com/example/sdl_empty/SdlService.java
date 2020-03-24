package com.example.sdl_empty;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SdlService extends Service {
        //...
        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }
}
