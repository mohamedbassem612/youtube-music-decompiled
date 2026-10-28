package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zye implements zxy {
    private final Context a;
    private final zwn b;

    public zye(Context context, vyt vytVar, zwn zwnVar) {
        context.getClass();
        this.a = context;
        vytVar.getClass();
        zwnVar.getClass();
        this.b = zwnVar;
    }

    @Override // defpackage.zxy
    public final amum a() {
        return amum.USER_AUTH;
    }

    @Override // defpackage.zxy
    public final void b(Map map, zyg zygVar) throws tmg {
        if (!tyu.h(zygVar.c())) {
            throw new IllegalStateException();
        }
        zwa zwaVarP = zygVar.P();
        if (zwaVarP.h()) {
            return;
        }
        String strC = zygVar.c();
        zwk zwkVarA = this.b.a(zwaVarP).a(zwaVarP);
        if (zwkVarA.f()) {
            Optional optionalB = zwkVarA.b(strC);
            if (optionalB.isPresent()) {
                map.put((String) ((Pair) optionalB.get()).first, (String) ((Pair) optionalB.get()).second);
                return;
            }
            return;
        }
        if (zwkVarA.e()) {
            throw new tmg(zwkVarA.a());
        }
        Exception excC = zwkVarA.c();
        if (excC instanceof IOException) {
            throw new tmg(this.a.getString(R.string.common_error_connection), excC);
        }
        throw new tmg(excC.getMessage() != null ? excC.getMessage() : "Unknown error");
    }

    @Override // defpackage.zxy
    public final boolean c() {
        return false;
    }
}
