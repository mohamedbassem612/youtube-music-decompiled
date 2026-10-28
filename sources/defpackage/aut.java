package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aut extends auu {
    public boolean c;
    public IconCompat e;
    public IconCompat f;
    public IconCompat g;
    private List l = new ArrayList();
    public List a = new ArrayList();
    public int b = 0;
    public boolean d = true;

    private static IconCompat h(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable instanceof Icon) {
                return aaj.g((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.f((Bitmap) parcelable);
            }
        }
        return null;
    }

    @Override // defpackage.auu
    protected final String a() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // defpackage.auu
    public final void b(Bundle bundle) {
        super.b(bundle);
        ArrayList arrayListJ = aie.j(bundle, "android.progressSegments", Bundle.class);
        ArrayList arrayList = new ArrayList();
        if (arrayListJ != null && !arrayListJ.isEmpty()) {
            for (int i = 0; i < arrayListJ.size(); i++) {
                Bundle bundle2 = (Bundle) arrayListJ.get(i);
                int i2 = bundle2.getInt("length");
                if (i2 > 0) {
                    int i3 = bundle2.getInt("id");
                    int i4 = bundle2.getInt("colorInt", 0);
                    int i5 = bundle2.getInt("semanticStyle", 0);
                    aus ausVar = new aus(i2);
                    ausVar.b = i3;
                    ausVar.c = i4;
                    ausVar.d = i5;
                    arrayList.add(ausVar);
                }
            }
        }
        this.l = arrayList;
        this.b = bundle.getInt("android.progress", 0);
        this.c = bundle.getBoolean("android.progressIndeterminate", false);
        this.d = bundle.getBoolean("android.styledByProgress", true);
        ArrayList arrayListJ2 = aie.j(bundle, "android.progressPoints", Bundle.class);
        ArrayList arrayList2 = new ArrayList();
        if (arrayListJ2 != null && !arrayListJ2.isEmpty()) {
            for (int i6 = 0; i6 < arrayListJ2.size(); i6++) {
                Bundle bundle3 = (Bundle) arrayListJ2.get(i6);
                int i7 = bundle3.getInt("position");
                if (i7 >= 0) {
                    int i8 = bundle3.getInt("id");
                    int i9 = bundle3.getInt("colorInt", 0);
                    int i10 = bundle3.getInt("semanticStyle", 0);
                    aur aurVar = new aur(i7);
                    aurVar.b = i8;
                    aurVar.c = i9;
                    aurVar.d = i10;
                    arrayList2.add(aurVar);
                }
            }
        }
        this.a = arrayList2;
        this.e = h((Parcelable) aie.i(bundle, "android.progressTrackerIcon", Icon.class));
        this.f = h((Parcelable) aie.i(bundle, "android.progressStartIcon", Icon.class));
        this.g = h((Parcelable) aie.i(bundle, "android.progressEndIcon", Icon.class));
    }

    public final int e() {
        List list = this.l;
        if (list == null || list.isEmpty()) {
            return 100;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = ((aus) list.get(i3)).a;
            if (i4 > 0) {
                long j = ((long) i2) + ((long) i4);
                i2 = (int) j;
                if (j != i2) {
                    try {
                        throw new ArithmeticException();
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
                i++;
            }
        }
        if (i != 0) {
            return i2;
        }
        return 100;
    }

    @Override // defpackage.auu
    public final void f(dep depVar) {
        int i = Build.VERSION.SDK_INT;
        Object obj = depVar.c;
        if (i < 36) {
            int iE = e();
            ((Notification.Builder) obj).setProgress(iE, Math.min(this.b, iE), this.c);
            return;
        }
        Object obj2 = depVar.b;
        Notification.Style progressStyle = new Notification.ProgressStyle();
        aup.j(progressStyle, this.d);
        aup.c(progressStyle, this.b);
        aup.e(progressStyle, this.c);
        IconCompat iconCompat = this.f;
        aup.h(progressStyle, iconCompat != null ? aaj.e(iconCompat, (Context) obj2) : null);
        IconCompat iconCompat2 = this.g;
        aup.d(progressStyle, iconCompat2 != null ? aaj.e(iconCompat2, (Context) obj2) : null);
        IconCompat iconCompat3 = this.e;
        aup.i(progressStyle, iconCompat3 != null ? aaj.e(iconCompat3, (Context) obj2) : null);
        int i2 = Build.VERSION.SDK_INT;
        List list = this.a;
        if (i2 >= 37) {
            auq.c(progressStyle, list);
            auq.d(progressStyle, this.l);
        } else {
            aup.f(progressStyle, list);
            aup.g(progressStyle, this.l);
        }
        ((Notification.Builder) obj).setStyle(progressStyle);
    }

    public final void g(List list) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aus ausVar = (aus) it.next();
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (ausVar.a > 0) {
                this.l.add(ausVar);
            }
        }
    }

    @Override // defpackage.auu
    public final void i(Bundle bundle) {
        super.i(bundle);
        if (Build.VERSION.SDK_INT <= 36) {
            List list = this.l;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    aus ausVar = (aus) list.get(i);
                    int i2 = ausVar.a;
                    if (i2 > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", i2);
                        bundle2.putInt("id", ausVar.b);
                        bundle2.putInt("colorInt", ausVar.c);
                        bundle2.putInt("semanticStyle", ausVar.d);
                        arrayList.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList);
            List list2 = this.a;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (list2 != null && !list2.isEmpty()) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    aur aurVar = (aur) list2.get(i3);
                    int i4 = aurVar.a;
                    if (i4 >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("position", i4);
                        bundle3.putInt("id", aurVar.b);
                        bundle3.putInt("colorInt", aurVar.c);
                        bundle3.putInt("semanticStyle", aurVar.d);
                        arrayList2.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList2);
        }
        if (Build.VERSION.SDK_INT < 36) {
            bundle.putInt("android.progress", this.b);
            bundle.putBoolean("android.progressIndeterminate", this.c);
            bundle.putInt("android.progressMax", e());
            bundle.putBoolean("android.styledByProgress", this.d);
            atr atrVar = this.h;
            Context context = atrVar != null ? atrVar.a : null;
            if (context != null) {
                IconCompat iconCompat = this.e;
                if (iconCompat != null) {
                    bundle.putParcelable("android.progressTrackerIcon", aaj.e(iconCompat, context));
                } else {
                    bundle.remove("android.progressTrackerIcon");
                }
                IconCompat iconCompat2 = this.f;
                if (iconCompat2 != null) {
                    bundle.putParcelable("android.progressStartIcon", aaj.e(iconCompat2, context));
                } else {
                    bundle.remove("android.progressStartIcon");
                }
                IconCompat iconCompat3 = this.g;
                if (iconCompat3 != null) {
                    bundle.putParcelable("android.progressEndIcon", aaj.e(iconCompat3, context));
                } else {
                    bundle.remove("android.progressEndIcon");
                }
            }
        }
    }
}
