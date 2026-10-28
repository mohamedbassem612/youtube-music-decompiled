package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzk {
    public static final Lock a = new ReentrantLock();
    public static jzk b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    public jzk(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        this.c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.c.unlock();
        }
    }
}
