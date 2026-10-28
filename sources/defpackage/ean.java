package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ean extends doc {
    private final Context c;

    public ean(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.doc
    public final void a(dpd dpdVar) {
        if (this.b >= 10) {
            dpdVar.j(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
