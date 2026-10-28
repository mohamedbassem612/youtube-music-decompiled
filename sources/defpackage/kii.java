package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kii extends kib {
    public static final List m = new CopyOnWriteArrayList();
    public final kid n;

    public kii(Context context, String str, String str2) {
        this(context, str, str2, kja.a, 0, new kjn(context), new kju(context), null, null);
    }

    public static kif f(Context context, String str) {
        kif kifVar = new kif(context, str);
        kifVar.a(kja.c);
        return kifVar;
    }

    public static kii h(Context context, String str) {
        return f(context, str).b();
    }

    public static void i(kig kigVar) {
        m.add(0, kigVar);
    }

    public final kih g(MessageLite messageLite) {
        kro.l(messageLite);
        return new kih(this, messageLite);
    }

    @Deprecated
    public final kih j(MessageLite messageLite, mea meaVar) {
        if (messageLite == null) {
            throw new NullPointerException("null reference");
        }
        kih kihVar = new kih(this, messageLite);
        if (!auqe.a.io().b(((kii) kihVar.a).e)) {
            kihVar.o = meaVar;
        }
        return kihVar;
    }

    public kii(Context context, String str, String str2, kja kjaVar, int i, kij kijVar, kiv kivVar, kid kidVar, kio kioVar) {
        super(context, str, str2, kjaVar, i, kijVar, kivVar, kioVar);
        this.n = kidVar;
    }
}
