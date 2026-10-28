package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ide {
    public static final ide a;
    public static final ide b;
    public static final ide c;
    public static final ide d;
    private static final /* synthetic */ ide[] e;

    static {
        ide ideVar = new ide("UNKNOWN", 0);
        a = ideVar;
        ide ideVar2 = new ide("REQUESTED", 1);
        b = ideVar2;
        ide ideVar3 = new ide("SUCCESSFUL", 2);
        c = ideVar3;
        ide ideVar4 = new ide("ERROR", 3);
        d = ideVar4;
        ide[] ideVarArr = {ideVar, ideVar2, ideVar3, ideVar4};
        e = ideVarArr;
        JniZero.m(ideVarArr);
    }

    public static ide[] values() {
        return (ide[]) e.clone();
    }
}
