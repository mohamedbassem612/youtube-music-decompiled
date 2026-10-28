package defpackage;

import android.os.Bundle;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afpl extends auom {
    private final cc a;

    public afpl(cc ccVar) {
        super(ccVar);
        this.a = ccVar;
    }

    public static final void b(cc ccVar, MessageLite messageLite) {
        auom.f(ccVar);
        Bundle arguments = ccVar.getArguments();
        messageLite.getClass();
        ahng.aG(arguments, "TIKTOK_FRAGMENT_ARGUMENT", messageLite);
    }

    @Override // defpackage.auom
    protected final Object a() {
        afuu afuuVarE = afwt.e(144, this.a.getClass(), "TTFCM#Component");
        try {
            Object objA = super.a();
            afuuVarE.close();
            return objA;
        } catch (Throwable th) {
            try {
                afuuVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.auom
    protected final void c(cc ccVar) {
        Class<?> cls = ccVar.getClass();
        cf activity = ccVar.getActivity();
        cls.getSimpleName();
        activity.getClass();
        ahno.U(ccVar.getActivity() instanceof afov, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", ccVar.getClass().getSimpleName(), ccVar.getActivity().getClass().getSimpleName());
    }
}
