package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubd extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audt audtVar = (audt) obj;
        aihf aihfVarCreateBuilder = ancz.a.createBuilder();
        if ((audtVar.b & 1) != 0) {
            agdy agdyVar = ueg.a;
            audj audjVarA = audj.a(audtVar.c);
            if (audjVarA == null) {
                audjVarA = audj.MEDIA_ENGINE_VIDEO_MIME_TYPE_UNKNOWN;
            }
            ancm ancmVar = (ancm) agdyVar.b(audjVarA);
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar = (ancz) aihfVarCreateBuilder.instance;
            anczVar.c = ancmVar.h;
            anczVar.b |= 1;
        }
        if ((audtVar.b & 2) != 0) {
            int i = audtVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar2 = (ancz) aihfVarCreateBuilder.instance;
            anczVar2.b |= 2;
            anczVar2.d = i;
        }
        if ((audtVar.b & 4) != 0) {
            int i2 = audtVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar3 = (ancz) aihfVarCreateBuilder.instance;
            anczVar3.b |= 4;
            anczVar3.e = i2;
        }
        if ((audtVar.b & 8) != 0) {
            long j = audtVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar4 = (ancz) aihfVarCreateBuilder.instance;
            anczVar4.b |= 8;
            anczVar4.f = j;
        }
        if ((audtVar.b & 16) != 0) {
            int i3 = audtVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar5 = (ancz) aihfVarCreateBuilder.instance;
            anczVar5.b |= 16;
            anczVar5.g = i3;
        }
        if ((audtVar.b & 32) != 0) {
            int i4 = audtVar.h;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar6 = (ancz) aihfVarCreateBuilder.instance;
            anczVar6.b |= 32;
            anczVar6.h = i4;
        }
        if ((audtVar.b & 64) != 0) {
            int i5 = audtVar.i;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar7 = (ancz) aihfVarCreateBuilder.instance;
            anczVar7.b |= 64;
            anczVar7.i = i5;
        }
        if ((audtVar.b & SemanticState.Focused) != 0) {
            float f = audtVar.j;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar8 = (ancz) aihfVarCreateBuilder.instance;
            anczVar8.b |= SemanticState.Focused;
            anczVar8.j = f;
        }
        if ((audtVar.b & SemanticState.Hidden) != 0) {
            int i6 = audtVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar9 = (ancz) aihfVarCreateBuilder.instance;
            anczVar9.b |= SemanticState.Hidden;
            anczVar9.k = i6;
        }
        if ((audtVar.b & SemanticState.LiveRegion) != 0) {
            int i7 = audtVar.l;
            aihfVarCreateBuilder.copyOnWrite();
            ancz anczVar10 = (ancz) aihfVarCreateBuilder.instance;
            anczVar10.b |= SemanticState.LiveRegion;
            anczVar10.l = i7;
        }
        return (ancz) aihfVarCreateBuilder.build();
    }
}
