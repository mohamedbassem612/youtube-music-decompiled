package defpackage;

import com.google.android.apps.youtube.proto.streaming.BufferedRangeOuterClass$BufferedRange;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uvr implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ uvr(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            uvq uvqVar = (uvq) obj;
            uvqVar.getClass();
            return uvq.a(uvqVar, null, null, false, this.a, 7);
        }
        if (i != 1) {
            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange = (BufferedRangeOuterClass$BufferedRange) obj;
            bufferedRangeOuterClass$BufferedRange.getClass();
            int iAV = a.aV(bufferedRangeOuterClass$BufferedRange.g);
            if (iAV == 0) {
                iAV = 1;
            }
            return Boolean.valueOf(iAV == this.a);
        }
        augm augmVar = (augm) obj;
        augmVar.getClass();
        aihf builder = augmVar.toBuilder();
        builder.getClass();
        builder.copyOnWrite();
        augm augmVar2 = (augm) builder.instance;
        augmVar2.c |= 8;
        augmVar2.e = this.a;
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (augm) aihnVarBuild;
    }
}
