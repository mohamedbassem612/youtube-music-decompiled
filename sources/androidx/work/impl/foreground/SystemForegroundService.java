package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import app.rive.semantics.SemanticState;
import defpackage.boj;
import defpackage.dhr;
import defpackage.dms;
import defpackage.dzf;
import defpackage.edt;
import defpackage.edu;
import defpackage.edv;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SystemForegroundService extends boj implements edt {
    public static final String a = dzf.a("SystemFgService");
    edu b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        edu eduVar = new edu(getApplicationContext());
        this.b = eduVar;
        if (eduVar.h == null) {
            eduVar.h = this;
        } else {
            dzf.b();
            Log.e(edu.a, "A callback already exists.");
        }
    }

    @Override // defpackage.edt
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.edt
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.edt
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            edv.a(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            startForeground(i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.edt
    public final void d(int i) {
        this.d = true;
        dzf.b();
        stopForeground(true);
        stopSelf(i);
    }

    @Override // defpackage.boj, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.boj, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            dzf.b();
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        edu eduVar = this.b;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            dzf.b();
            Objects.toString(intent);
            intent.toString();
            eduVar.j.aw(new dhr((Object) eduVar, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), 9, (char[]) null));
            eduVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            eduVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            dzf.b();
            edt edtVar = eduVar.h;
            if (edtVar == null) {
                return 3;
            }
            edtVar.d(i2);
            return 3;
        }
        dzf.b();
        Objects.toString(intent);
        intent.toString();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        dms.i(UUID.fromString(stringExtra), eduVar.b);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT < 35) {
            this.b.d(i, SemanticState.Modal);
        }
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i, i2);
    }
}
