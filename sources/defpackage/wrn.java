package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wrn extends wlu {
    public final ArrayList a;
    public final aihf b;
    private aocv c;

    public wrn(abxv abxvVar, zwa zwaVar) {
        super("notification_registration/set_registration", abxvVar, zwaVar, 1, true, null, null);
        this.c = aocv.a;
        this.a = new ArrayList();
        this.b = aocu.a.createBuilder();
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        taq.c();
        aihf aihfVarCreateBuilder = alsy.a.createBuilder();
        aihf builder = this.c.toBuilder();
        aihf aihfVar = this.b;
        aihfVar.copyOnWrite();
        aocu aocuVar = (aocu) aihfVar.instance;
        aocu aocuVar2 = aocu.a;
        aocuVar.g = aocu.emptyProtobufList();
        aihfVar.copyOnWrite();
        aocu aocuVar3 = (aocu) aihfVar.instance;
        aiie aiieVar = aocuVar3.g;
        if (!aiieVar.c()) {
            aocuVar3.g = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, aocuVar3.g);
        builder.copyOnWrite();
        aocv aocvVar = (aocv) builder.instance;
        aocu aocuVar4 = (aocu) aihfVar.build();
        aocuVar4.getClass();
        aocvVar.c = aocuVar4;
        aocvVar.b = 1;
        aocv aocvVar2 = (aocv) builder.build();
        this.c = aocvVar2;
        aihfVarCreateBuilder.copyOnWrite();
        alsy alsyVar = (alsy) aihfVarCreateBuilder.instance;
        aocvVar2.getClass();
        alsyVar.d = aocvVar2;
        alsyVar.b |= 2;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(1 == (((aocu) this.b.instance).b & 1));
    }
}
