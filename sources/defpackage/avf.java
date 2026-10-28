package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class avf implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    public avf(Context context) {
        this.b = context;
    }

    public final void a(Intent intent) {
        this.a.add(intent);
    }

    public final void b(ComponentName componentName) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        try {
            Context context = this.b;
            for (Intent intentE = api.e(context, componentName); intentE != null; intentE = api.e(context, intentE.getComponent())) {
                arrayList.add(size, intentE);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
