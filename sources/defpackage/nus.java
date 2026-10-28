package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nus {
    public static ovi a(np npVar) {
        if (npVar instanceof LinearLayoutManager) {
            return new adgc((LinearLayoutManager) npVar, 1);
        }
        throw new IllegalArgumentException("Unsupported LayoutManager: ".concat(String.valueOf(String.valueOf(npVar))));
    }
}
