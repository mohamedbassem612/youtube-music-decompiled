package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zvi {
    public static String a(zvh zvhVar, zwb zwbVar, ci ciVar) {
        String str = zvhVar.a;
        return (!TextUtils.isEmpty(str) || zwbVar.e().m() || zvhVar.b) ? str : ciVar.aD(zwbVar.e());
    }
}
