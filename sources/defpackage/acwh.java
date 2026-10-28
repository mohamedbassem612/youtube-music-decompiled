package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class acwh implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    public final vxe a;
    public final Object b;
    public AlertDialog c;
    private final acwn d;
    private final String e;
    private boolean f;
    private final abfv g;

    protected acwh(vxe vxeVar, abfv abfvVar, Object obj, String str) {
        vxeVar.getClass();
        this.a = vxeVar;
        this.g = abfvVar;
        this.b = obj;
        this.e = str;
        this.f = false;
        this.d = abfvVar == null ? null : new acwg(this, 0);
    }

    protected Map a() {
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b);
        map.put(xhd.c, Boolean.TRUE);
        return map;
    }

    public final void b(int i) {
        ahno.O(this.c != null);
        g(i);
        this.f = true;
        agev agevVarM = tym.M(this.c.getContext());
        if (agevVarM.g()) {
            Activity activity = (Activity) agevVarM.c();
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        this.c.dismiss();
    }

    protected void d() {
        throw null;
    }

    protected final void e(AlertDialog alertDialog) {
        alertDialog.getClass();
        ahno.O(this.c == null);
        this.c = alertDialog;
        alertDialog.setOnDismissListener(this);
    }

    protected final void f() {
        ahno.O(this.c != null);
        abfv abfvVar = this.g;
        if (abfvVar != null) {
            String str = this.e;
            acwn acwnVar = this.d;
            if (str == null) {
                abfvVar.m(acwnVar, "");
            } else {
                abfvVar.m(acwnVar, str);
            }
        }
        this.c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ahno.O(dialogInterface == this.c);
        if (i < 0) {
            if (i == -1) {
                d();
                b(1);
            } else if (i == -3) {
                b(2);
            } else if (i == -2) {
                c();
                b(3);
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.f) {
            this.f = true;
            g(5);
        }
        abfv abfvVar = this.g;
        if (abfvVar != null) {
            String str = this.e;
            acwn acwnVar = this.d;
            if (str == null) {
                abfvVar.o(acwnVar, "");
            } else {
                abfvVar.o(acwnVar, str);
            }
        }
    }

    protected void c() {
    }

    protected void g(int i) {
    }
}
