package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inc extends imf {
    private final awmd a;
    private final Executor b;
    private Optional c;

    public inc(awmd awmdVar, Executor executor) {
        super(anyx.class, amto.class);
        this.a = awmdVar;
        this.b = executor;
    }

    private final void e(aihf aihfVar, anyx anyxVar, agkj agkjVar) {
        this.c = hmy.al("display_context", imk.class, agkjVar);
        alay alayVarC = ackj.c(anyxVar.getTitle());
        aihfVar.copyOnWrite();
        amto amtoVar = (amto) aihfVar.instance;
        amto amtoVar2 = amto.a;
        alayVarC.getClass();
        amtoVar.d = alayVarC;
        amtoVar.b |= 4;
        alay alayVarC2 = ackj.c(anyxVar.getArtistNames());
        aihfVar.copyOnWrite();
        amto amtoVar3 = (amto) aihfVar.instance;
        alayVarC2.getClass();
        amtoVar3.f = alayVarC2;
        amtoVar3.b |= 16;
        aqmh thumbnailDetails = anyxVar.getThumbnailDetails();
        aihfVar.copyOnWrite();
        amto amtoVar4 = (amto) aihfVar.instance;
        thumbnailDetails.getClass();
        amtoVar4.e = thumbnailDetails;
        amtoVar4.b |= 8;
    }

    @Override // defpackage.imf, defpackage.iml
    public final /* synthetic */ ListenableFuture a(Object obj, agkj agkjVar) {
        anyx anyxVar = (anyx) obj;
        aihf aihfVarCreateBuilder = amto.a.createBuilder();
        e(aihfVarCreateBuilder, anyxVar, agkjVar);
        String strAr = kro.ar(anyxVar.f());
        if (!TextUtils.isEmpty(anyxVar.f()) && this.c.isPresent()) {
            int i = ((imk) this.c.get()).b;
            if (i == 0) {
                throw null;
            }
            if (i == 1 && strAr != null) {
                return ahno.ar(((iup) this.a.io()).i(ixt.m(strAr)), new iii(aihfVarCreateBuilder, 5), this.b);
            }
        }
        return ahng.n((amto) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.iml
    public final /* bridge */ /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        aihf aihfVarCreateBuilder = amto.a.createBuilder();
        e(aihfVarCreateBuilder, (anyx) obj, agkjVar);
        return (amto) aihfVarCreateBuilder.build();
    }
}
