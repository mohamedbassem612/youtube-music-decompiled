package defpackage;

import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tps implements tpq {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/common/preferences/SharedPreferencesSettingsStore");
    public final SharedPreferences a;
    public final awkv b;
    private final tao d;
    private final Executor e;
    private final agek f;
    private final sya g;
    private final MessageLite h;

    public tps(tao taoVar, Executor executor, SharedPreferences sharedPreferences, agek agekVar, sya syaVar, MessageLite messageLite) {
        this.d = taoVar;
        this.e = new ahfg(executor);
        this.a = sharedPreferences;
        this.f = agekVar;
        this.g = syaVar;
        this.h = messageLite;
        awkv awkvVarAI = new awku().aI();
        this.b = awkvVarAI;
        awkvVarAI.kk((MessageLite) agekVar.apply(sharedPreferences));
    }

    @Override // defpackage.tpq
    public final ListenableFuture a() {
        MessageLite messageLiteC = c();
        return messageLiteC == null ? aher.a : new aher(messageLiteC);
    }

    @Override // defpackage.tpq
    public final ListenableFuture b(agek agekVar) {
        apbr apbrVar = this.d.d().e;
        if (apbrVar == null) {
            apbrVar = apbr.a;
        }
        if (apbrVar.d) {
            return ahno.aq(new gwj(this, agekVar, 20), this.e);
        }
        try {
            SharedPreferences.Editor editorEdit = this.a.edit();
            MessageLite messageLiteE = e(editorEdit, agekVar);
            editorEdit.apply();
            this.b.kk(messageLiteE);
            return ahng.n(null);
        } catch (Exception e) {
            return ahng.m(e);
        }
    }

    @Override // defpackage.tpq
    public final MessageLite c() {
        try {
            return (MessageLite) this.f.apply(this.a);
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/android/libraries/youtube/common/preferences/SharedPreferencesSettingsStore", "blockAndGetData", (char) 134, "SharedPreferencesSettingsStore.java")).t("Could not write SharedPreferences values to proto schema.");
            return this.h;
        }
    }

    @Override // defpackage.tpq
    public final avlh d() {
        return this.b.E();
    }

    public final MessageLite e(SharedPreferences.Editor editor, agek agekVar) {
        MessageLite messageLite = (MessageLite) agekVar.apply((MessageLite) this.f.apply(this.a));
        this.g.a(editor, messageLite);
        return messageLite;
    }
}
