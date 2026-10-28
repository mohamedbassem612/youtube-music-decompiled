package defpackage;

import android.media.AudioFormat;
import android.util.Size;
import com.google.mediapipe.framework.Graph;
import com.google.research.aimatter.drishti.DrishtiCache;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.InputFrameSource;
import com.google.research.xeno.effect.MultiEffectProcessorBase;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atuv extends MultiEffectProcessorBase {
    public static final /* synthetic */ int e = 0;

    public atuv(final atth atthVar, final InputFrameSource inputFrameSource, final Size size, final AudioFormat audioFormat) {
        super(atthVar);
        DrishtiCache drishtiCache = atthVar.b;
        final long jA = drishtiCache != null ? drishtiCache.a() : 0L;
        final long[] jArr = new long[1];
        atqo.b(Arrays.asList(null, null), new atvf() { // from class: atuu
            @Override // defpackage.atvf
            public final void a(long[] jArr2) {
                int channelCount;
                int i;
                atth atthVar2 = atthVar;
                agke agkeVar = atthVar2.c;
                atuv atuvVar = this.a;
                Graph graph = atuvVar.h;
                long j = jArr2[0];
                long j2 = jArr2[1];
                long jA2 = graph.a();
                long[] jArrJ = ahng.J(agkeVar);
                byte[] bArrA = atvu.a(atthVar2.d);
                Size size2 = size;
                long width = size2.getWidth();
                long height = size2.getHeight();
                AudioFormat audioFormat2 = audioFormat;
                if (audioFormat2 == null) {
                    i = 0;
                    channelCount = 0;
                } else {
                    int sampleRate = audioFormat2.getSampleRate();
                    channelCount = audioFormat2.getChannelCount();
                    i = sampleRate;
                }
                InputFrameSource inputFrameSource2 = inputFrameSource;
                long j3 = atthVar2.a;
                jArr[0] = atuv.nativeNewProcessor(1, j, j2, jA2, jA, jArrJ, j3, bArrA, inputFrameSource2.e, width, height, i, channelCount, new atvt(atuvVar.k, atuvVar.i), new atvr(atuvVar.j), new atvs(Effect.d, atuvVar.l));
            }
        });
        super.n(jArr[0], null, null);
    }

    public final void k(Callbacks$StatusCallback callbacks$StatusCallback) {
        iD(new atvj(callbacks$StatusCallback, 1));
    }

    public atuv(atwd atwdVar, atwc atwcVar, final atth atthVar) {
        super(atthVar);
        DrishtiCache drishtiCache = atthVar.b;
        final long jA = drishtiCache != null ? drishtiCache.a() : 0L;
        final long[] jArr = new long[1];
        atqo.b(Arrays.asList(atwdVar, atwcVar), new atvf() { // from class: atvb
            @Override // defpackage.atvf
            public final void a(long[] jArr2) {
                atth atthVar2 = atthVar;
                agke agkeVar = atthVar2.c;
                atuv atuvVar = this.d;
                Graph graph = atuvVar.h;
                long j = jArr2[0];
                long j2 = jArr2[1];
                long jA2 = graph.a();
                long[] jArrJ = ahng.J(agkeVar);
                byte[] bArrA = atvu.a(atthVar2.d);
                atvt atvtVar = new atvt(atuvVar.k, atuvVar.i);
                atvr atvrVar = new atvr(atuvVar.j);
                atvs atvsVar = new atvs(Effect.d, atuvVar.l);
                jArr[0] = atuv.nativeNewMultiEffectProcessorWithLifecycle(1, j, j2, jA2, jA, jArrJ, atthVar2.a, bArrA, atvtVar, atvrVar, atvsVar);
            }
        });
        super.n(jArr[0], atwdVar, atwcVar);
    }
}
