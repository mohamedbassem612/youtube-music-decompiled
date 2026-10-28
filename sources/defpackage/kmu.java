package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kmu extends Exception {

    @Deprecated
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    public kmu(Status status) {
        int i = status.f;
        String str = status.g;
        super(i + ": " + (str == null ? "" : str));
        this.a = status;
    }

    public final int a() {
        return this.a.f;
    }
}
