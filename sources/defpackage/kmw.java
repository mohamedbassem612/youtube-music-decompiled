package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kmw extends Exception {
    private final afv a;

    public kmw(afv afvVar) {
        this.a = afvVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        afv afvVar = this.a;
        boolean z = true;
        for (knu knuVar : afvVar.keySet()) {
            klo kloVar = (klo) afvVar.get(knuVar);
            kro.l(kloVar);
            z &= !kloVar.d();
            arrayList.add(knuVar.a() + ": " + kloVar.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
