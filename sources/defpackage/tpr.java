package defpackage;

import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tpr implements qrh {
    public final awmd a;
    public agkj b = agpn.b;
    private final agex c;
    private final agek d;
    private final Consumer e;
    private final sya f;
    private final ahex g;

    public tpr(awmd awmdVar, agex agexVar, agek agekVar, Consumer consumer, sya syaVar, ahex ahexVar) {
        this.a = awmdVar;
        this.c = agexVar;
        this.d = agekVar;
        this.e = consumer;
        this.f = syaVar;
        this.g = ahexVar;
    }

    @Override // defpackage.qrh
    public final ListenableFuture a() {
        return this.b.isEmpty() ? aher.a : this.g.submit(new tsp(this, 1));
    }

    @Override // defpackage.qrh
    public final /* bridge */ /* synthetic */ ListenableFuture b(MessageLite messageLite) {
        aihn aihnVar = (aihn) messageLite;
        Boolean bool = (Boolean) this.d.apply(aihnVar);
        if (bool == null) {
            return ahng.m(new IllegalArgumentException("isMigrated cannot return a null value"));
        }
        if (bool.booleanValue()) {
            return aihnVar == null ? aher.a : new aher(aihnVar);
        }
        aihf builder = aihnVar.toBuilder();
        agkh agkhVar = new agkh(4);
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a.io()).getAll().entrySet()) {
            if (this.c.a(entry.getKey())) {
                if (entry instanceof Set) {
                    agkhVar.e(entry.getKey(), agkz.n((Set) entry));
                } else {
                    agkhVar.f(entry);
                }
            }
        }
        this.b = agkhVar.d(true);
        this.f.a(new dov(this.b, (byte[]) null), builder);
        this.e.r(builder);
        aihn aihnVarBuild = builder.build();
        return aihnVarBuild == null ? aher.a : new aher(aihnVarBuild);
    }

    @Override // defpackage.qrh
    public final ListenableFuture c() {
        return new aher(Boolean.TRUE);
    }
}
