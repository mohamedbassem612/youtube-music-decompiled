package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hzd {
    public static final hzd a;
    public static final hzd b;
    private static final /* synthetic */ hzd[] c;

    static {
        hzd hzdVar = new hzd("METADATA_UPDATE", 0);
        a = hzdVar;
        hzd hzdVar2 = new hzd("PLAYLIST_UPDATE", 1);
        b = hzdVar2;
        hzd[] hzdVarArr = {hzdVar, hzdVar2};
        c = hzdVarArr;
        JniZero.m(hzdVarArr);
    }

    public static hzd[] values() {
        return (hzd[]) c.clone();
    }
}
