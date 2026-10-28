package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mqh implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ aihi b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mqh(gug gugVar, amlg amlgVar, ajwo ajwoVar, Map map, zwa zwaVar, int i) {
        this.$cid = i;
        this.a = gugVar;
        this.c = amlgVar;
        this.b = ajwoVar;
        this.d = map;
        this.e = zwaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nse] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, nse] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ?? r4 = this.e;
            Object obj2 = this.d;
            Object obj3 = this.c;
            ((isi) this.a).w((CommandOuterClass$Command) this.b, (SenderStateOuterClass$SenderState) obj3, (assc) obj2, r4);
            return;
        }
        if (i == 1) {
            ?? r0 = this.d;
            aihi aihiVar = this.b;
            ((gug) this.a).f((amlg) this.c, (ajwo) aihiVar, r0, obj);
            return;
        }
        ?? r5 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        ((isi) this.a).w((CommandOuterClass$Command) this.b, (SenderStateOuterClass$SenderState) obj5, (assc) obj4, r5);
    }

    public /* synthetic */ mqh(isi isiVar, CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, assc asscVar, nse nseVar, int i) {
        this.$cid = i;
        this.a = isiVar;
        this.b = commandOuterClass$Command;
        this.c = senderStateOuterClass$SenderState;
        this.d = asscVar;
        this.e = nseVar;
    }
}
