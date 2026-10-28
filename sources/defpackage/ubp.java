package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubp extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auef auefVar = (auef) obj;
        aihf aihfVarCreateBuilder = andm.a.createBuilder();
        if ((auefVar.b & 1) != 0) {
            int i = auefVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andm andmVar = (andm) aihfVarCreateBuilder.instance;
            andmVar.b |= 1;
            andmVar.c = i;
        }
        if ((auefVar.b & 2) != 0) {
            int i2 = auefVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            andm andmVar2 = (andm) aihfVarCreateBuilder.instance;
            andmVar2.b |= 2;
            andmVar2.d = i2;
        }
        if ((auefVar.b & 4) != 0) {
            int i3 = auefVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            andm andmVar3 = (andm) aihfVarCreateBuilder.instance;
            andmVar3.b |= 4;
            andmVar3.e = i3;
        }
        if ((auefVar.b & 8) != 0) {
            agdy agdyVar = uen.b;
            auda audaVarA = auda.a(auefVar.f);
            if (audaVarA == null) {
                audaVarA = auda.MEDIA_ENGINE_AUDIO_MIME_TYPE_UNKNOWN;
            }
            ance anceVar = (ance) agdyVar.b(audaVarA);
            aihfVarCreateBuilder.copyOnWrite();
            andm andmVar4 = (andm) aihfVarCreateBuilder.instance;
            andmVar4.f = anceVar.e;
            andmVar4.b |= 8;
        }
        if ((auefVar.b & 16) != 0) {
            agdy agdyVar2 = uen.a;
            audj audjVarA = audj.a(auefVar.g);
            if (audjVarA == null) {
                audjVarA = audj.MEDIA_ENGINE_VIDEO_MIME_TYPE_UNKNOWN;
            }
            ancm ancmVar = (ancm) agdyVar2.b(audjVarA);
            aihfVarCreateBuilder.copyOnWrite();
            andm andmVar5 = (andm) aihfVarCreateBuilder.instance;
            andmVar5.g = ancmVar.h;
            andmVar5.b |= 16;
        }
        if ((auefVar.b & 32) != 0) {
            int i4 = auefVar.h;
            aihfVarCreateBuilder.copyOnWrite();
            andm andmVar6 = (andm) aihfVarCreateBuilder.instance;
            andmVar6.b |= 32;
            andmVar6.h = i4;
        }
        if ((auefVar.b & 64) != 0) {
            float f = auefVar.i;
            aihfVarCreateBuilder.copyOnWrite();
            andm andmVar7 = (andm) aihfVarCreateBuilder.instance;
            andmVar7.b |= 64;
            andmVar7.i = f;
        }
        return (andm) aihfVarCreateBuilder.build();
    }
}
