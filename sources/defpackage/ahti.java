package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahti extends Exception {
    public ahti(String str) {
        super(str);
        if (str != null) {
            str.toLowerCase(Locale.US).hashCode();
        }
    }
}
