package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uay extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audo audoVar = (audo) obj;
        aihf aihfVarCreateBuilder = ancu.a.createBuilder();
        if ((audoVar.b & 1) != 0) {
            agdy agdyVar = uec.a;
            auda audaVarA = auda.a(audoVar.c);
            if (audaVarA == null) {
                audaVarA = auda.MEDIA_ENGINE_AUDIO_MIME_TYPE_UNKNOWN;
            }
            ance anceVar = (ance) agdyVar.b(audaVarA);
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar = (ancu) aihfVarCreateBuilder.instance;
            ancuVar.c = anceVar.e;
            ancuVar.b |= 1;
        }
        if ((audoVar.b & 2) != 0) {
            int i = audoVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar2 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar2.b |= 2;
            ancuVar2.d = i;
        }
        if ((audoVar.b & 4) != 0) {
            int i2 = audoVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar3 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar3.b |= 4;
            ancuVar3.e = i2;
        }
        if ((audoVar.b & 8) != 0) {
            long j = audoVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar4 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar4.b |= 8;
            ancuVar4.f = j;
        }
        if ((audoVar.b & 16) != 0) {
            int i3 = audoVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar5 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar5.b |= 16;
            ancuVar5.g = i3;
        }
        if ((audoVar.b & 32) != 0) {
            int i4 = audoVar.h;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar6 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar6.b |= 32;
            ancuVar6.h = i4;
        }
        if ((audoVar.b & 64) != 0) {
            int i5 = audoVar.i;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar7 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar7.b |= 64;
            ancuVar7.i = i5;
        }
        if ((audoVar.b & SemanticState.Focused) != 0) {
            int i6 = audoVar.j;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar8 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar8.b |= SemanticState.Focused;
            ancuVar8.j = i6;
        }
        if ((audoVar.b & SemanticState.Hidden) != 0) {
            int i7 = audoVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar9 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar9.b |= SemanticState.Hidden;
            ancuVar9.k = i7;
        }
        if ((audoVar.b & SemanticState.LiveRegion) != 0) {
            int i8 = audoVar.l;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar10 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar10.b |= SemanticState.LiveRegion;
            ancuVar10.l = i8;
        }
        if ((audoVar.b & SemanticState.ReadOnly) != 0) {
            int i9 = audoVar.m;
            aihfVarCreateBuilder.copyOnWrite();
            ancu ancuVar11 = (ancu) aihfVarCreateBuilder.instance;
            ancuVar11.b |= SemanticState.ReadOnly;
            ancuVar11.m = i9;
        }
        return (ancu) aihfVarCreateBuilder.build();
    }
}
