package defpackage;

import android.os.Process;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatn implements aarw {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask");
    private final abxv A;
    private final aazo B;
    zgj a;
    final grj b;
    private final aauk d;
    private final aarv e;
    private final aaqn f;
    private final wjb g;
    private final aamw h;
    private final String i;
    private final String j;
    private final String k;
    private final byte[] l;
    private final String m;
    private ynw n;
    private final aatp o;
    private final aatt p;
    private final mbc q;
    private final int r;
    private final String s;
    private final aodp t;
    private final aatr u;
    private final yoz v;
    private final zgm w;
    private final zjr x;
    private final awmd y;
    private volatile boolean z;

    public aatn(aarv aarvVar, aaqn aaqnVar, wjb wjbVar, mbc mbcVar, txp txpVar, aamw aamwVar, grj grjVar, aatr aatrVar, abxv abxvVar, zgm zgmVar, aauk aaukVar, yoz yozVar, aazo aazoVar, zjr zjrVar, awmd awmdVar) {
        this.e = aarvVar;
        this.f = aaqnVar;
        this.g = wjbVar;
        this.q = mbcVar;
        this.h = aamwVar;
        this.b = grjVar;
        this.u = aatrVar;
        this.A = abxvVar;
        this.w = zgmVar;
        this.d = aaukVar;
        this.v = yozVar;
        this.x = zjrVar;
        this.B = aazoVar;
        this.y = awmdVar;
        aamb aambVar = aamwVar.f;
        long j = aarq.a;
        this.r = aambVar.a("stream_quality");
        this.t = aarq.b(aamwVar.f);
        this.s = aamwVar.f.f("audio_track_id");
        this.i = aamwVar.a;
        this.j = txpVar.a();
        this.k = aarq.e(aamwVar.f);
        this.l = aamwVar.f.n("click_tracking_params");
        this.p = new aatt();
        this.o = new aatp(mbcVar, aaqnVar.f(), new avgj(this, null), aamwVar.i, aaukVar.b.c(28, 45843985L, 0L), aaukVar.b.c(29, 45846366L, 0L));
        this.m = aamwVar.f.p();
    }

    private final aamb c() {
        aatt aattVar = this.p;
        long j = aattVar.g + aattVar.h;
        long j2 = aarq.a;
        aamb aambVar = this.h.g;
        aambVar.k("cache_bytes_read", j);
        aambVar.k("storage_bytes_read", aattVar.e + aattVar.f);
        return aambVar;
    }

    private final void d(aarx aarxVar) {
        if (aarxVar.a) {
            Throwable cause = aarxVar.getCause();
            agrf agrfVar = c;
            if (cause != null) {
                ((agrc) ((agrc) ((agrc) agrfVar.b()).j(cause)).k("com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask", "onStreamDownloadError", 669, "OfflineVideoAdThumbnailTransferTask.java")).B("[Offline] pudl task cotn [%s] failed: %s", this.m, aarxVar.getMessage());
            } else {
                ((agrc) ((agrc) ((agrc) agrfVar.b()).j(new IllegalArgumentException())).k("com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask", "onStreamDownloadError", 672, "OfflineVideoAdThumbnailTransferTask.java")).B("[Offline] pudl task cotn [%s] failed, unknown cause: %s", this.m, aarxVar.getMessage());
            }
        } else {
            ((agrc) ((agrc) c.c()).k("com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask", "onStreamDownloadError", 676, "OfflineVideoAdThumbnailTransferTask.java")).B("[Offline] pudl task cotn [%s]: %s", this.m, aarxVar.getMessage());
        }
        zgj zgjVar = this.a;
        if (zgjVar != null) {
            zgjVar.e();
        }
        this.e.c(this.i, aarxVar, c());
    }

    private static final zwa e(aamw aamwVar, aaqn aaqnVar) {
        zwa zwaVar = aamwVar.j;
        return zwaVar.h() ? aaqnVar.b() : zwaVar;
    }

    private static final boolean f(aaml aamlVar, boolean z) {
        if (z) {
            return true;
        }
        return (aamlVar == null || aamlVar.i()) ? false : true;
    }

    @Override // defpackage.aarw
    public final void a(int i) {
        this.z = true;
        ynw ynwVar = this.n;
        if (ynwVar != null) {
            ynwVar.a((i & 384) == 0);
        }
    }

    public final void b(long j, double d, boolean z) {
        this.e.b(this.i, j, d, z);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d9 A[Catch: Exception -> 0x07ee, InterruptedException -> 0x07f0, IOException -> 0x07f7, aato -> 0x07f9, aarx -> 0x07fe, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02f7 A[Catch: InterruptedException -> 0x0336, Exception -> 0x068e, aato -> 0x07ec, IOException -> 0x07f7, aarx -> 0x07fe, TRY_LEAVE, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:156:0x031d A[Catch: InterruptedException -> 0x03d0, Exception -> 0x068e, aato -> 0x07ec, IOException -> 0x07f7, aarx -> 0x07fe, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:158:0x032a A[Catch: InterruptedException -> 0x03d0, Exception -> 0x068e, aato -> 0x07ec, IOException -> 0x07f7, aarx -> 0x07fe, TRY_LEAVE, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:168:0x034e A[Catch: InterruptedException -> 0x03d0, Exception -> 0x068e, aato -> 0x07ec, IOException -> 0x07f7, aarx -> 0x07fe, LOOP:2: B:166:0x0348->B:168:0x034e, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:186:0x03bc A[Catch: InterruptedException -> 0x03d0, Exception -> 0x068e, aato -> 0x07ec, IOException -> 0x07f7, aarx -> 0x07fe, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:192:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:193:0x03da  */
    /* JADX WARN: Code duplicated, block: B:203:0x041e A[Catch: Exception -> 0x068e, InterruptedException -> 0x0696, aato -> 0x07ab, IOException -> 0x07f7, aarx -> 0x07fe, TRY_LEAVE, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0444 A[Catch: Exception -> 0x068e, InterruptedException -> 0x0696, aato -> 0x07a7, IOException -> 0x07f7, aarx -> 0x07fe, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:210:0x045c A[Catch: Exception -> 0x068e, InterruptedException -> 0x0696, aato -> 0x07a7, IOException -> 0x07f7, aarx -> 0x07fe, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0490  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ce A[LOOP:7: B:201:0x0418->B:219:0x04ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x04de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x04e0 A[Catch: Exception -> 0x068e, InterruptedException -> 0x0696, aato -> 0x07a7, IOException -> 0x07f7, aarx -> 0x07fe, TRY_ENTER, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:226:0x04f2 A[Catch: Exception -> 0x068e, InterruptedException -> 0x0696, aato -> 0x07a7, IOException -> 0x07f7, aarx -> 0x07fe, TRY_LEAVE, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:259:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:266:0x060e  */
    /* JADX WARN: Code duplicated, block: B:268:0x0612 A[Catch: Exception -> 0x068e, InterruptedException -> 0x0696, aato -> 0x07a7, IOException -> 0x07f7, aarx -> 0x07fe, TRY_LEAVE, TryCatch #0 {IOException -> 0x07f7, blocks: (B:144:0x02cb, B:146:0x02d9, B:147:0x02dd, B:149:0x02e3, B:150:0x02f1, B:152:0x02f7, B:154:0x02fd, B:156:0x031d, B:158:0x032a, B:165:0x0344, B:166:0x0348, B:168:0x034e, B:170:0x035c, B:171:0x0367, B:173:0x036d, B:175:0x038e, B:183:0x03ae, B:184:0x03b6, B:186:0x03bc, B:194:0x03db, B:198:0x040b, B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:221:0x04d6, B:224:0x04e0, B:226:0x04f2, B:265:0x05fb, B:268:0x0612, B:289:0x0663, B:298:0x06a6), top: B:423:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:271:0x0622 A[Catch: RuntimeException -> 0x065e, ExecutionException -> 0x0660, IOException | RuntimeException | ExecutionException -> 0x0662, Exception -> 0x068e, InterruptedException -> 0x0696, TryCatch #7 {InterruptedException -> 0x0696, blocks: (B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:224:0x04e0, B:226:0x04f2, B:227:0x04f8, B:229:0x0500, B:231:0x0516, B:233:0x0524, B:234:0x0530, B:236:0x0536, B:238:0x054a, B:240:0x055e, B:242:0x0564, B:244:0x0585, B:246:0x05bc, B:247:0x05c2, B:265:0x05fb, B:253:0x05da, B:268:0x0612, B:269:0x061a, B:271:0x0622, B:273:0x0630, B:274:0x0634, B:276:0x063a, B:278:0x0646, B:280:0x064c, B:282:0x0652, B:289:0x0663), top: B:425:0x0414 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x0630 A[Catch: RuntimeException -> 0x065e, ExecutionException -> 0x0660, IOException | RuntimeException | ExecutionException -> 0x0662, Exception -> 0x068e, InterruptedException -> 0x0696, TryCatch #7 {InterruptedException -> 0x0696, blocks: (B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:224:0x04e0, B:226:0x04f2, B:227:0x04f8, B:229:0x0500, B:231:0x0516, B:233:0x0524, B:234:0x0530, B:236:0x0536, B:238:0x054a, B:240:0x055e, B:242:0x0564, B:244:0x0585, B:246:0x05bc, B:247:0x05c2, B:265:0x05fb, B:253:0x05da, B:268:0x0612, B:269:0x061a, B:271:0x0622, B:273:0x0630, B:274:0x0634, B:276:0x063a, B:278:0x0646, B:280:0x064c, B:282:0x0652, B:289:0x0663), top: B:425:0x0414 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x063a A[Catch: RuntimeException -> 0x065e, ExecutionException -> 0x0660, IOException | RuntimeException | ExecutionException -> 0x0662, Exception -> 0x068e, InterruptedException -> 0x0696, TryCatch #7 {InterruptedException -> 0x0696, blocks: (B:200:0x0414, B:201:0x0418, B:203:0x041e, B:205:0x0440, B:207:0x0444, B:208:0x0450, B:210:0x045c, B:212:0x0494, B:214:0x0498, B:216:0x049c, B:217:0x04ca, B:224:0x04e0, B:226:0x04f2, B:227:0x04f8, B:229:0x0500, B:231:0x0516, B:233:0x0524, B:234:0x0530, B:236:0x0536, B:238:0x054a, B:240:0x055e, B:242:0x0564, B:244:0x0585, B:246:0x05bc, B:247:0x05c2, B:265:0x05fb, B:253:0x05da, B:268:0x0612, B:269:0x061a, B:271:0x0622, B:273:0x0630, B:274:0x0634, B:276:0x063a, B:278:0x0646, B:280:0x064c, B:282:0x0652, B:289:0x0663), top: B:425:0x0414 }] */
    /* JADX WARN: Code duplicated, block: B:295:0x069e  */
    /* JADX WARN: Code duplicated, block: B:297:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:303:0x06f0 A[Catch: InterruptedException -> 0x089d, IOException -> 0x08a0, aato -> 0x08a2, aarx -> 0x08a4, Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:306:0x070c A[Catch: InterruptedException -> 0x089d, IOException -> 0x08a0, aato -> 0x08a2, aarx -> 0x08a4, Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:307:0x073d  */
    /* JADX WARN: Code duplicated, block: B:310:0x0743 A[Catch: InterruptedException -> 0x089d, IOException -> 0x08a0, aato -> 0x08a2, aarx -> 0x08a4, Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x074b A[Catch: InterruptedException -> 0x089d, IOException -> 0x08a0, aato -> 0x08a2, aarx -> 0x08a4, Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:313:0x077c  */
    /* JADX WARN: Code duplicated, block: B:316:0x0782 A[Catch: InterruptedException -> 0x089d, IOException -> 0x08a0, aato -> 0x08a2, aarx -> 0x08a4, Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x078b A[Catch: InterruptedException -> 0x089d, IOException -> 0x08a0, aato -> 0x08a2, aarx -> 0x08a4, Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:322:0x07a3 A[Catch: InterruptedException -> 0x089d, IOException -> 0x08a0, aato -> 0x08a2, aarx -> 0x08a4, Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:401:0x08f2 A[Catch: Exception -> 0x0a8e, TRY_LEAVE, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:404:0x0a21 A[Catch: aaob -> 0x0a66, Exception -> 0x0a8e, TryCatch #28 {aaob -> 0x0a66, blocks: (B:402:0x08f4, B:404:0x0a21, B:405:0x0a27), top: B:441:0x08f4, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:408:0x0a44 A[Catch: Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:410:0x0a7f A[Catch: Exception -> 0x0a8e, TryCatch #11 {Exception -> 0x0a8e, blocks: (B:391:0x08ad, B:399:0x08ea, B:401:0x08f2, B:402:0x08f4, B:404:0x0a21, B:405:0x0a27, B:406:0x0a35, B:408:0x0a44, B:409:0x0a66, B:410:0x0a7f, B:301:0x06c3, B:303:0x06f0, B:304:0x06fe, B:306:0x070c, B:308:0x073f, B:310:0x0743, B:312:0x074b, B:314:0x077e, B:316:0x0782, B:318:0x078b, B:319:0x0798, B:320:0x079f, B:322:0x07a3, B:300:0x06b6, B:395:0x08dd, B:413:0x0a8a, B:372:0x080e, B:373:0x0837, B:374:0x0838, B:375:0x0861, B:379:0x0866, B:380:0x089c), top: B:426:0x0077, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:425:0x0414 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x036d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0ad9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [agrc] */
    /* JADX WARN: Type inference failed for: r0v7, types: [agrc] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [aatr] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Exception exc;
        ?? r11;
        InterruptedException interruptedException;
        ?? r12;
        ?? r8;
        int i;
        boolean z;
        aatr aatrVar;
        aofh aofhVar;
        aiie aiieVar;
        aarv aarvVar;
        String str;
        aaro aaroVarE;
        int i2;
        wjf wjfVar;
        aaew aaewVar;
        int i3;
        Object obj;
        int i4;
        char c2;
        HashSet hashSet;
        ArrayList arrayList;
        aazo aazoVar;
        ArrayList<wjf> arrayList2;
        long j;
        aiie aiieVar2;
        String str2;
        Iterator it;
        String str3;
        boolean z2;
        boolean z3;
        char c3;
        long j2;
        long j3;
        Iterator it2;
        aamw aamwVar;
        boolean z4;
        aatp aatpVar;
        int i5;
        Iterator it3;
        aamm aammVar;
        grj grjVarC;
        String str4;
        ynw ynwVarA;
        ynw ynwVar;
        String strG;
        aaml aamlVar;
        String str5;
        aaml aamlVar2;
        aalf aalfVarG;
        aarv aarvVar2;
        String str6;
        grj grjVarC2;
        String str7;
        ynw ynwVarA2;
        ynw ynwVar2;
        aatp aatpVar2;
        aaml aamlVar3;
        boolean zF;
        String str8;
        zgj zgjVar;
        aaml aamlVar4;
        boolean zF2;
        String strG2;
        accc acccVarE;
        List<acca> listH;
        List listAq;
        aatr aatrVar2;
        zwa zwaVar;
        String str9;
        accc acccVarE2;
        aqph aqphVar;
        InterruptedException e;
        Iterator it4;
        Iterator it5;
        alvt alvtVar;
        wji wjiVar;
        aoop aoopVar;
        zfs zfsVar;
        aatn aatnVar = this;
        String str10 = "OfflineVideoAdThumbnailTransferTask.java";
        ?? r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
        Process.setThreadPriority(10);
        try {
            aaqn aaqnVar = aatnVar.f;
            aaew aaewVarD = aaqnVar.d();
            aamw aamwVar2 = aatnVar.h;
            boolean z5 = aamwVar2.i;
            String str11 = "pinVideoInterstitialThumbnail";
            try {
                if (!z5 && aaewVarD == null) {
                    ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask", "pinVideoInterstitialThumbnail", 231, "OfflineVideoAdThumbnailTransferTask.java")).t("[Offline] Couldn't get db helper due to initialization or non-active store.");
                    return;
                }
                if (aatnVar.z) {
                    return;
                }
                String str12 = aatnVar.k;
                if (TextUtils.isEmpty(str12)) {
                    aatnVar.d(new aarx(true, "No videoid specified on video transfer.", new IllegalArgumentException(), aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON));
                    return;
                }
                if (aatnVar.x.bL() && (zfsVar = (zfs) aatnVar.y.io()) != null) {
                    zh zhVar = new zh((byte[]) null, (char[]) null);
                    zhVar.m(str12);
                    zfsVar.j(zhVar.l());
                }
                int i6 = 1;
                try {
                    try {
                        try {
                            try {
                                try {
                                    aalf aalfVarG2 = aaqnVar.g();
                                    if (!z5) {
                                        aamb aambVar = aamwVar2.f;
                                        long j4 = aarq.a;
                                        String strF = aambVar.f("playlist_id");
                                        aauk aaukVar = aatnVar.d;
                                        if ((!aaukVar.F() || strF != null) && ((!aaukVar.E() || strF == null) && aalfVarG2 != null)) {
                                            aatnVar.u.f(aaewVarD, aalfVarG2, aamwVar2);
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            } catch (aato e3) {
                                e = e3;
                                i = i6;
                                z = aatnVar.h.i;
                                aatrVar = aatnVar.u;
                                if (!z) {
                                    aatnVar.d(aatrVar.b(e));
                                    return;
                                }
                                String str13 = aatnVar.k;
                                try {
                                    aany aanyVar = (aany) aatrVar.d.io();
                                    aofh aofhVar2 = aofh.a;
                                    aihf aihfVarCreateBuilder = aofhVar2.createBuilder();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                                    int i7 = i;
                                    aofhVar3.c = i7;
                                    aofhVar3.b |= i7;
                                    String strG3 = wfs.g(119, str13);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aofh aofhVar4 = (aofh) aihfVarCreateBuilder.instance;
                                    strG3.getClass();
                                    aofhVar4.b |= 2;
                                    aofhVar4.d = strG3;
                                    aofg aofgVar = aofg.b;
                                    aihh aihhVar = (aihh) aofgVar.createBuilder();
                                    aihhVar.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                                    aihhVar.copyOnWrite();
                                    aofg aofgVar2 = (aofg) aihhVar.instance;
                                    aofgVar2.e();
                                    aofgVar2.f.h(15);
                                    aihl aihlVar = aoom.b;
                                    aihf aihfVarCreateBuilder2 = aoom.a.createBuilder();
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    aoom aoomVar = (aoom) aihfVarCreateBuilder2.instance;
                                    aoomVar.c |= 16;
                                    aoomVar.g = true;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    aoom aoomVar2 = (aoom) aihfVarCreateBuilder2.instance;
                                    aoomVar2.c |= 16384;
                                    aoomVar2.o = true;
                                    aihhVar.e(aihlVar, (aoom) aihfVarCreateBuilder2.build());
                                    aofg aofgVar3 = (aofg) aihhVar.build();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aofh aofhVar5 = (aofh) aihfVarCreateBuilder.instance;
                                    aofgVar3.getClass();
                                    aofhVar5.e = aofgVar3;
                                    aofhVar5.b |= 4;
                                    aihf aihfVarCreateBuilder3 = aofhVar2.createBuilder();
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    aofh aofhVar6 = (aofh) aihfVarCreateBuilder3.instance;
                                    aofhVar6.c = 4;
                                    aofhVar6.b |= 1;
                                    String strC = aatr.c(str13);
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    aofh aofhVar7 = (aofh) aihfVarCreateBuilder3.instance;
                                    strC.getClass();
                                    aofhVar7.b |= 2;
                                    aofhVar7.d = strC;
                                    aihh aihhVar2 = (aihh) aofgVar.createBuilder();
                                    aihl aihlVar2 = aqpb.b;
                                    aihf aihfVarCreateBuilder4 = aqpb.a.createBuilder();
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    aqpb aqpbVar = (aqpb) aihfVarCreateBuilder4.instance;
                                    aqpbVar.c |= 4;
                                    aqpbVar.f = true;
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    aqpb aqpbVar2 = (aqpb) aihfVarCreateBuilder4.instance;
                                    aqpbVar2.c |= SemanticState.Modal;
                                    aqpbVar2.m = true;
                                    aihhVar2.e(aihlVar2, (aqpb) aihfVarCreateBuilder4.build());
                                    aofg aofgVar4 = (aofg) aihhVar2.build();
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    aofh aofhVar8 = (aofh) aihfVarCreateBuilder3.instance;
                                    aofgVar4.getClass();
                                    aofhVar8.e = aofgVar4;
                                    aofhVar8.b |= 4;
                                    aofh aofhVar9 = (aofh) aihfVarCreateBuilder3.build();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aofhVar = (aofh) aihfVarCreateBuilder.instance;
                                    aofhVar9.getClass();
                                    aiieVar = aofhVar.g;
                                    if (!aiieVar.c()) {
                                        aofhVar.g = aihn.mutableCopy(aiieVar);
                                    }
                                    aofhVar.g.add(aofhVar9);
                                    aanyVar.a((aofh) aihfVarCreateBuilder.build());
                                    aarvVar = aatnVar.e;
                                    str = aatnVar.i;
                                    aaroVarE = ((aask) aarvVar).u.e(str);
                                    if (aaroVarE != null) {
                                        aaroVarE.j = aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
                                        ((aask) aarvVar).f.b(str);
                                        ((aask) aarvVar).i.remove(str);
                                        ((aask) aarvVar).c.j(aaroVarE);
                                        ((aask) aarvVar).h();
                                        return;
                                    }
                                    return;
                                } catch (aaob unused) {
                                    aatnVar.e.c(aatnVar.i, new aarx(true, "Internal error. Couldn't enqueue a player response refetch", null, aamg.CANNOT_OFFLINE, aogv.OFFLINE_DOWNLOAD_CONTROLLER_ERROR), aatnVar.c());
                                    return;
                                }
                                exc = e;
                                r11 = r9;
                                ((agrc) ((agrc) ((agrc) c.b()).j(exc)).k(r11, "run", 183, str10)).w("[Offline] pudl task cotn [%s] error while pinning video", aatnVar.m);
                                zvp.b(zvn.b, zvm.C, "VideoAd pin exception: ".concat(String.valueOf(exc.getMessage())), exc);
                                aatnVar.d(new aarx(false, "Error encountered while pinning the video", exc, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON));
                            }
                        } catch (IOException e4) {
                            e = e4;
                            aatnVar.d(aatnVar.u.b(e));
                            return;
                        }
                    } catch (InterruptedException e5) {
                        interruptedException = e5;
                        str10 = "OfflineVideoAdThumbnailTransferTask.java";
                        r12 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                        r8 = "pinVideoInterstitialThumbnail";
                    }
                } catch (aarx unused2) {
                }
                try {
                    try {
                        aaqn aaqnVar2 = aatnVar.f;
                        aafu aafuVarF = aaqnVar2.f();
                        aamw aamwVar3 = aatnVar.h;
                        boolean z6 = aamwVar3.i;
                        r9 = aatnVar.u;
                        str10 = "TransferTaskUtil.java";
                        try {
                            if (!z6) {
                                String str14 = aatnVar.k;
                                byte[] bArr = aatnVar.l;
                                ardd arddVar = (ardd) r9.c.b(e(aamwVar3, aaqnVar2)).g(wfs.g(461, str14)).g(ardd.class).E();
                                try {
                                    wjf wjfVarJ = r9.e.j(str14, arddVar == null ? aofb.OFFLINE_TYPE_UNKNOWN : arddVar.getOfflineModeType(), bArr, null, aaewVarD != null ? aaewVarD.g(str14) : null);
                                    aogq aogqVarV = wjfVarJ.v();
                                    if (aatnVar.h.i || aaewVarD == null) {
                                        i2 = 1;
                                        wjfVar = wjfVarJ;
                                        aaewVar = null;
                                    } else {
                                        try {
                                            String str15 = aatnVar.k;
                                            boolean zEquals = Objects.equals(aaewVarD.g(str15), aogqVarV != null ? aogqVarV.e : null);
                                            if (aaewVarD.c(str15) == null || !zEquals) {
                                                i2 = 1;
                                                try {
                                                    wjfVar = wjfVarJ;
                                                    aaewVar = null;
                                                    aatnVar.u.d(aatnVar.i, str15, wjfVar, aaewVarD, aatnVar.q.f().toEpochMilli(), aatnVar.g);
                                                } catch (aato e6) {
                                                    e = e6;
                                                    i = i2;
                                                }
                                            } else {
                                                i2 = 1;
                                                wjfVar = wjfVarJ;
                                                aaewVar = null;
                                            }
                                        } catch (aato e7) {
                                            e = e7;
                                            i2 = 1;
                                            i = i2;
                                        }
                                    }
                                } catch (wno e8) {
                                    ((agrc) ((agrc) ((agrc) aatr.a.b()).j(e8)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "requestPlayerResponseForOffline", 185, "TransferTaskUtil.java")).w("[Offline] pudl task[%s] failed to retrieve player response", aamwVar3.a);
                                    throw new aarx(false, "Cannot retrieve player response from the server.", e8, aamg.NETWORK_READ_ERROR, aogv.OFFLINE_NETWORK_ERROR);
                                }
                                z = aatnVar.h.i;
                                aatrVar = aatnVar.u;
                                if (!z) {
                                    aatnVar.d(aatrVar.b(e));
                                    return;
                                }
                                String str16 = aatnVar.k;
                                aany aanyVar2 = (aany) aatrVar.d.io();
                                aofh aofhVar10 = aofh.a;
                                aihf aihfVarCreateBuilder5 = aofhVar10.createBuilder();
                                aihfVarCreateBuilder5.copyOnWrite();
                                aofh aofhVar11 = (aofh) aihfVarCreateBuilder5.instance;
                                int i8 = i;
                                aofhVar11.c = i8;
                                aofhVar11.b |= i8;
                                String strG4 = wfs.g(119, str16);
                                aihfVarCreateBuilder5.copyOnWrite();
                                aofh aofhVar12 = (aofh) aihfVarCreateBuilder5.instance;
                                strG4.getClass();
                                aofhVar12.b |= 2;
                                aofhVar12.d = strG4;
                                aofg aofgVar5 = aofg.b;
                                aihh aihhVar3 = (aihh) aofgVar5.createBuilder();
                                aihhVar3.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                                aihhVar3.copyOnWrite();
                                aofg aofgVar6 = (aofg) aihhVar3.instance;
                                aofgVar6.e();
                                aofgVar6.f.h(15);
                                aihl aihlVar3 = aoom.b;
                                aihf aihfVarCreateBuilder6 = aoom.a.createBuilder();
                                aihfVarCreateBuilder6.copyOnWrite();
                                aoom aoomVar3 = (aoom) aihfVarCreateBuilder6.instance;
                                aoomVar3.c |= 16;
                                aoomVar3.g = true;
                                aihfVarCreateBuilder6.copyOnWrite();
                                aoom aoomVar4 = (aoom) aihfVarCreateBuilder6.instance;
                                aoomVar4.c |= 16384;
                                aoomVar4.o = true;
                                aihhVar3.e(aihlVar3, (aoom) aihfVarCreateBuilder6.build());
                                aofg aofgVar7 = (aofg) aihhVar3.build();
                                aihfVarCreateBuilder5.copyOnWrite();
                                aofh aofhVar13 = (aofh) aihfVarCreateBuilder5.instance;
                                aofgVar7.getClass();
                                aofhVar13.e = aofgVar7;
                                aofhVar13.b |= 4;
                                aihf aihfVarCreateBuilder7 = aofhVar10.createBuilder();
                                aihfVarCreateBuilder7.copyOnWrite();
                                aofh aofhVar14 = (aofh) aihfVarCreateBuilder7.instance;
                                aofhVar14.c = 4;
                                aofhVar14.b |= 1;
                                String strC2 = aatr.c(str16);
                                aihfVarCreateBuilder7.copyOnWrite();
                                aofh aofhVar15 = (aofh) aihfVarCreateBuilder7.instance;
                                strC2.getClass();
                                aofhVar15.b |= 2;
                                aofhVar15.d = strC2;
                                aihh aihhVar4 = (aihh) aofgVar5.createBuilder();
                                aihl aihlVar4 = aqpb.b;
                                aihf aihfVarCreateBuilder8 = aqpb.a.createBuilder();
                                aihfVarCreateBuilder8.copyOnWrite();
                                aqpb aqpbVar3 = (aqpb) aihfVarCreateBuilder8.instance;
                                aqpbVar3.c |= 4;
                                aqpbVar3.f = true;
                                aihfVarCreateBuilder8.copyOnWrite();
                                aqpb aqpbVar4 = (aqpb) aihfVarCreateBuilder8.instance;
                                aqpbVar4.c |= SemanticState.Modal;
                                aqpbVar4.m = true;
                                aihhVar4.e(aihlVar4, (aqpb) aihfVarCreateBuilder8.build());
                                aofg aofgVar8 = (aofg) aihhVar4.build();
                                aihfVarCreateBuilder7.copyOnWrite();
                                aofh aofhVar16 = (aofh) aihfVarCreateBuilder7.instance;
                                aofgVar8.getClass();
                                aofhVar16.e = aofgVar8;
                                aofhVar16.b |= 4;
                                aofh aofhVar17 = (aofh) aihfVarCreateBuilder7.build();
                                aihfVarCreateBuilder5.copyOnWrite();
                                aofhVar = (aofh) aihfVarCreateBuilder5.instance;
                                aofhVar17.getClass();
                                aiieVar = aofhVar.g;
                                if (!aiieVar.c()) {
                                    aofhVar.g = aihn.mutableCopy(aiieVar);
                                }
                                aofhVar.g.add(aofhVar17);
                                aanyVar2.a((aofh) aihfVarCreateBuilder5.build());
                                aarvVar = aatnVar.e;
                                str = aatnVar.i;
                                aaroVarE = ((aask) aarvVar).u.e(str);
                                if (aaroVarE != null) {
                                    aaroVarE.j = aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
                                    ((aask) aarvVar).f.b(str);
                                    ((aask) aarvVar).i.remove(str);
                                    ((aask) aarvVar).c.j(aaroVarE);
                                    ((aask) aarvVar).h();
                                    return;
                                }
                                return;
                            }
                            zwa zwaVarE = e(aamwVar3, aaqnVar2);
                            wjf wjfVarAj = (zwaVarE.h() || (aoopVar = (aoop) r9.c.b(zwaVarE).g(wfs.g(119, aatnVar.k)).g(aoop.class).t().E()) == null) ? null : wji.aj(aoopVar.getPlayerResponseBytes().G(), 0L);
                            if (wjfVarAj == null) {
                                aatnVar.e.c(aatnVar.i, new aarx(true, "PlayerResponse doesn't exist", null, aamg.CANNOT_OFFLINE, aogv.NO_RESPONSE), aatnVar.c());
                                return;
                            } else {
                                i2 = 1;
                                wjfVar = wjfVarAj;
                                aaewVar = null;
                            }
                            aatr aatrVar3 = aatnVar.u;
                            String str17 = aatnVar.i;
                            abqq abqqVar = aatrVar3.e;
                            if (!abqq.l(wjfVar)) {
                                ((agrc) ((agrc) aatr.a.c()).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "validateOfflinePlayerResponse", 205, str10)).w("[Offline] pudl task[%s] received actionable playability error.", str17);
                                throw new aarx(true, "Playability error", null, aamg.CANNOT_OFFLINE, aogv.NOT_PLAYABLE);
                            }
                            if (!abqq.k(wjfVar)) {
                                ((agrc) ((agrc) aatr.a.b()).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "validateOfflinePlayerResponse", ModuleDescriptor.MODULE_VERSION, "TransferTaskUtil.java")).w("[Offline] pudl task[%s] received offline state error.", str17);
                                throw new aarx(true, "Offline state error", null, aamg.CANNOT_OFFLINE, aogv.NOT_OFFLINABLE);
                            }
                            aamw aamwVar4 = aatnVar.h;
                            boolean z7 = aamwVar4.i;
                            if (!z7 && aaewVarD != null) {
                                aatrVar3.e(str17, aatnVar.k, aaewVarD, aatnVar.e);
                            }
                            wja wjaVarG = wjfVar.g();
                            int iA = aatnVar.r;
                            if (iA != 0) {
                                i3 = iA;
                            } else {
                                if (wjfVar != null) {
                                    alvc alvcVar = wjfVar.t().n;
                                    if (alvcVar == null) {
                                        alvcVar = alvc.a;
                                    }
                                    ajhi ajhiVar = alvcVar.c;
                                    if (ajhiVar == null) {
                                        ajhiVar = ajhi.a;
                                    }
                                    akxs akxsVarA = akxs.a(ajhiVar.e);
                                    if (akxsVarA == null) {
                                        akxsVarA = akxs.FEATURE_AVAILABILITY_UNKNOWN;
                                    }
                                    if (akxsVarA == akxs.FEATURE_AVAILABILITY_BLOCKED) {
                                        iA = aaus.a(aohx.SD, 0);
                                        i3 = iA;
                                    }
                                }
                                i3 = 0;
                            }
                            aodp aodpVar = aatnVar.t;
                            String str18 = aatnVar.s;
                            String str19 = aatnVar.k;
                            aamm aammVarA = aatrVar3.a(i3, aodpVar, str18, str19, wjaVarG, wjfVar.f(), aafuVarF, z7);
                            aafu aafuVar = aafuVarF;
                            aafuVar.a(str19, aammVarA);
                            try {
                                zgj zgjVarB = aatnVar.w.b(wjfVar.h().e, aatnVar.j, null, aatnVar.m, Integer.valueOf(aarq.c(aamwVar4.f) == aofb.OFFLINE_MODE_TYPE_AUTO_OFFLINE ? 2 : 1), str19, wjaVarG, false, wjfVar.f(), wjfVar.h().b(), false);
                                aatnVar.a = zgjVarB;
                                if (zgjVarB != null) {
                                    try {
                                        yoz yozVar = aatnVar.v;
                                        try {
                                            i4 = 1;
                                            try {
                                                if (!yozVar.f.j(1)) {
                                                    yozVar.c.post(new xoy(yozVar, zgjVarB, 11));
                                                }
                                            } catch (RuntimeException unused3) {
                                                zhq zhqVar = zhq.ABR;
                                            }
                                        } catch (RuntimeException unused4) {
                                            i4 = 1;
                                        }
                                    } catch (aato e9) {
                                        e = e9;
                                        i6 = 1;
                                        i = i6;
                                    }
                                } else {
                                    i4 = 1;
                                }
                                aamw aamwVar5 = aatnVar.h;
                                if (!aamwVar5.f.m("is_unmetered_5g", false)) {
                                    c2 = 2;
                                    hashSet = new HashSet();
                                    arrayList = new ArrayList();
                                    aazoVar = aatnVar.B;
                                    arrayList2 = new ArrayList();
                                    j = wjfVar.g().i;
                                    aiieVar2 = wjfVar.u().C;
                                    if (!aiieVar2.isEmpty()) {
                                        it4 = aiieVar2.iterator();
                                        while (it4.hasNext()) {
                                            it5 = ((amfb) it4.next()).b.iterator();
                                            while (it5.hasNext()) {
                                                str2 = str11;
                                                Iterator it6 = it4;
                                                Iterator it7 = it5;
                                                alvtVar = (alvt) ((wjr) aazoVar.a).D(((amfa) it5.next()).c.G(), alvt.a);
                                                if (alvtVar != null) {
                                                    wjiVar = new wji(alvtVar, j, (wjb) aazoVar.b);
                                                    if (wjiVar.c != null) {
                                                        arrayList2.add(wjiVar);
                                                    }
                                                }
                                                it4 = it6;
                                                it5 = it7;
                                                str11 = str2;
                                            }
                                            c2 = 2;
                                        }
                                    }
                                    str2 = str11;
                                    it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        hashSet.add(((wjf) it.next()).G());
                                    }
                                    str3 = aatnVar.k;
                                    z2 = aamwVar5.i;
                                    aafuVar.b(hashSet, str3, z2);
                                    for (wjf wjfVar2 : arrayList2) {
                                        c3 = 2;
                                        boolean z8 = z2;
                                        aafu aafuVar2 = aafuVar;
                                        arrayList.add(new agew(wjfVar2, aatnVar.u.a(aatnVar.r, aatnVar.t, null, wjfVar2.G(), wjfVar2.g(), wjfVar2.f(), aafuVar2, z8)));
                                        aafuVar = aafuVar2;
                                        z2 = z8;
                                    }
                                    z3 = z2;
                                    c3 = 2;
                                    j2 = aammVarA.c;
                                    j3 = aammVarA.d;
                                    it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        aamm aammVar2 = (aamm) ((agew) it2.next()).b;
                                        aamw aamwVar6 = aamwVar5;
                                        j2 += aammVar2.c;
                                        j3 += aammVar2.d;
                                        aamwVar5 = aamwVar6;
                                        c3 = 2;
                                    }
                                    aamwVar = aamwVar5;
                                    if (j3 > j2) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    aatpVar = aatnVar.o;
                                    aatpVar.c = j3;
                                    aatpVar.b = 0L;
                                    aarv aarvVar3 = aatnVar.e;
                                    String str20 = aatnVar.i;
                                    aasi aasiVarA = aasj.a(6);
                                    aasiVarA.f(str20);
                                    aasiVarA.g(j3);
                                    ((aask) aarvVar3).f(aasiVarA.a());
                                    aatnVar = this;
                                    String str21 = str2;
                                    i5 = 1;
                                    aatnVar.b(j2, 0.0d, z4);
                                    if (!arrayList.isEmpty()) {
                                        it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            agew agewVar = (agew) it3.next();
                                            wjf wjfVar3 = (wjf) agewVar.a;
                                            aammVar = (aamm) agewVar.b;
                                            grjVarC = aatnVar.b.C();
                                            str4 = (String) grjVarC.w().f();
                                            i = i5;
                                            ynwVarA = aatnVar.n;
                                            if (ynwVarA == null) {
                                                ynwVarA = ((aatj) grjVarC.a).a();
                                                ynwVarA.b = aatpVar;
                                                aatnVar.n = ynwVarA;
                                            }
                                            ynwVar = ynwVarA;
                                            strG = wjfVar3.G();
                                            aatpVar.a = strG;
                                            aamlVar = aammVar.a;
                                            if (aamlVar != null) {
                                                aatr aatrVar4 = aatnVar.u;
                                                String str22 = aatnVar.j;
                                                long jB = aamlVar.b();
                                                aafu aafuVarF2 = aatnVar.f.f();
                                                aatt aattVar = aatnVar.p;
                                                str5 = strG;
                                                aatrVar4.g(str5, str22, ynwVar, aamlVar, jB, aafuVarF2, str4, aattVar.c, aattVar.a, aatnVar.A);
                                                aatpVar.b += aamlVar.b();
                                            } else {
                                                str5 = strG;
                                            }
                                            if (!aatnVar.z) {
                                                aatr aatrVar5 = aatnVar.u;
                                                String str23 = aatnVar.j;
                                                long jB2 = aamlVar2.b();
                                                aafu aafuVarF3 = aatnVar.f.f();
                                                aatt aattVar2 = aatnVar.p;
                                                aatrVar5.g(str5, str23, ynwVar, aamlVar2, jB2, aafuVarF3, str4, aattVar2.d, aattVar2.b, aatnVar.A);
                                                aatpVar.b += aamlVar2.b();
                                            }
                                            if (!aatnVar.z) {
                                                return;
                                            }
                                            it3 = it3;
                                            i5 = i;
                                        }
                                    }
                                    aalfVarG = aatnVar.f.g();
                                    if (aalfVarG != null) {
                                        j3 = j3;
                                        ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask", "downloadSubtitlesAndVideoStreams", 556, "OfflineVideoAdThumbnailTransferTask.java")).w("[Offline] pudl task cotn [%s] subtitle failed, no filestore", aatnVar.m);
                                    } else if (z3) {
                                        aatrVar2 = aatnVar.u;
                                        zwaVar = aamwVar.j;
                                        String strG5 = wjfVar.G();
                                        if (zwaVar.h()) {
                                            j3 = j3;
                                        } else {
                                            wcn wcnVarB = aatrVar2.c.b(zwaVar);
                                            acccVarE2 = accc.e(wjfVar, aatrVar2.b);
                                            if (acccVarE2 != null) {
                                                j3 = j3;
                                            } else {
                                                j3 = j3;
                                            }
                                        }
                                    } else {
                                        j3 = j3;
                                        if (aaewVarD != null) {
                                            aatr aatrVar6 = aatnVar.u;
                                            strG2 = wjfVar.G();
                                            acccVarE = accc.e(wjfVar, aatrVar6.b);
                                            if (acccVarE != null) {
                                                listH = acccVarE.h();
                                                listAq = aaewVarD.aq(strG2);
                                                if (!listH.isEmpty()) {
                                                    for (acca accaVar : listH) {
                                                        if (listAq.contains(accaVar)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            aaewVarD = aaewVar;
                                        }
                                    }
                                    aarvVar2 = aatnVar.e;
                                    str6 = aatnVar.i;
                                    aasi aasiVarA2 = aasj.a(18);
                                    aasiVarA2.f(str6);
                                    ((aask) aarvVar2).f(aasiVarA2.a());
                                    grjVarC2 = aatnVar.b.C();
                                    str7 = (String) grjVarC2.w().f();
                                    ynwVarA2 = aatnVar.n;
                                    if (ynwVarA2 == null) {
                                        ynwVarA2 = ((aatj) grjVarC2.a).a();
                                        ynwVarA2.b = aatnVar.o;
                                        aatnVar.n = ynwVarA2;
                                    }
                                    ynwVar2 = ynwVarA2;
                                    aatpVar2 = aatnVar.o;
                                    aatpVar2.a = str3;
                                    aamlVar3 = aammVarA.b;
                                    zF = f(aamlVar3, z4);
                                    if (aamlVar3 != null) {
                                        aatr aatrVar7 = aatnVar.u;
                                        String str24 = aatnVar.j;
                                        long jB3 = aamlVar3.b();
                                        aafu aafuVarF4 = aatnVar.f.f();
                                        aatt aattVar3 = aatnVar.p;
                                        str8 = str3;
                                        aatrVar7.g(str8, str24, ynwVar2, aamlVar3, jB3, aafuVarF4, str7, aattVar3.d, aattVar3.b, aatnVar.A);
                                        aatpVar2.b += aamlVar3.b();
                                    } else {
                                        str8 = str3;
                                    }
                                    if (!aatnVar.z) {
                                        aamlVar4 = aammVarA.a;
                                        zF2 = f(aamlVar4, zF);
                                        if (aamlVar4 != null) {
                                            aatr aatrVar8 = aatnVar.u;
                                            String str25 = aatnVar.j;
                                            long jB4 = aamlVar4.b();
                                            aafu aafuVarF5 = aatnVar.f.f();
                                            aatt aattVar4 = aatnVar.p;
                                            aatrVar8.g(str8, str25, ynwVar2, aamlVar4, jB4, aafuVarF5, str7, aattVar4.c, aattVar4.a, aatnVar.A);
                                            aatpVar2.b += aamlVar4.b();
                                        }
                                        if (!aatnVar.z) {
                                            aatnVar.b(j3, 0.0d, zF2);
                                            if (aaewVarD != null) {
                                                aaewVarD.W(str8, aatnVar.q.f().toEpochMilli());
                                            }
                                            aarvVar2.a(str6, aatnVar.c());
                                        }
                                    }
                                    zgjVar = aatnVar.a;
                                    if (zgjVar != null) {
                                        zgjVar.e();
                                        return;
                                    }
                                    return;
                                }
                                try {
                                    zgj zgjVar2 = aatnVar.a;
                                    if (zgjVar2 != null) {
                                        c2 = 2;
                                        try {
                                            zgjVar2.M("cat", "unmetered_5g", 2);
                                        } catch (aato e10) {
                                            e = e10;
                                            str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                            r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                            i = i4;
                                        }
                                    } else {
                                        c2 = 2;
                                    }
                                    hashSet = new HashSet();
                                    arrayList = new ArrayList();
                                    aazoVar = aatnVar.B;
                                    arrayList2 = new ArrayList();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        j = wjfVar.g().i;
                                                        aiieVar2 = wjfVar.u().C;
                                                        if (!aiieVar2.isEmpty()) {
                                                            it4 = aiieVar2.iterator();
                                                            while (it4.hasNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            it5 = ((amfb) it4.next()).b.iterator();
                                                                            while (it5.hasNext()) {
                                                                                str2 = str11;
                                                                                try {
                                                                                    Iterator it8 = it4;
                                                                                    Iterator it9 = it5;
                                                                                    alvtVar = (alvt) ((wjr) aazoVar.a).D(((amfa) it5.next()).c.G(), alvt.a);
                                                                                    if (alvtVar != null) {
                                                                                        wjiVar = new wji(alvtVar, j, (wjb) aazoVar.b);
                                                                                        if (wjiVar.c != null) {
                                                                                            arrayList2.add(wjiVar);
                                                                                        }
                                                                                    }
                                                                                    it4 = it8;
                                                                                    it5 = it9;
                                                                                    str11 = str2;
                                                                                } catch (InterruptedException e11) {
                                                                                    e = e11;
                                                                                    interruptedException = e;
                                                                                    str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                                    r12 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                                    r8 = str2;
                                                                                    ((agrc) ((agrc) ((agrc) c.b()).j(interruptedException)).k(r12, r8, 467, str10)).w("[Offline] pudl task cotn [%s] error while downloading video", aatnVar.m);
                                                                                    aatnVar.d(new aarx(false, "Error encountered while downloading the video", interruptedException, aamg.FAILED_UNKNOWN, aogv.OFFLINE_TRANSFER_INTERRUPTED));
                                                                                    return;
                                                                                }
                                                                            }
                                                                            c2 = 2;
                                                                        } catch (Exception e12) {
                                                                            exc = e12;
                                                                            str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                            r11 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                        }
                                                                    } catch (aato e13) {
                                                                        e = e13;
                                                                        str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                        obj = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                        r9 = obj;
                                                                        i = 1;
                                                                        z = aatnVar.h.i;
                                                                        aatrVar = aatnVar.u;
                                                                        if (!z) {
                                                                            aatnVar.d(aatrVar.b(e));
                                                                            return;
                                                                        }
                                                                        String str110 = aatnVar.k;
                                                                        aany aanyVar3 = (aany) aatrVar.d.io();
                                                                        aofh aofhVar18 = aofh.a;
                                                                        aihf aihfVarCreateBuilder9 = aofhVar18.createBuilder();
                                                                        aihfVarCreateBuilder9.copyOnWrite();
                                                                        aofh aofhVar19 = (aofh) aihfVarCreateBuilder9.instance;
                                                                        int i9 = i;
                                                                        aofhVar19.c = i9;
                                                                        aofhVar19.b |= i9;
                                                                        String strG6 = wfs.g(119, str110);
                                                                        aihfVarCreateBuilder9.copyOnWrite();
                                                                        aofh aofhVar110 = (aofh) aihfVarCreateBuilder9.instance;
                                                                        strG6.getClass();
                                                                        aofhVar110.b |= 2;
                                                                        aofhVar110.d = strG6;
                                                                        aofg aofgVar9 = aofg.b;
                                                                        aihh aihhVar5 = (aihh) aofgVar9.createBuilder();
                                                                        aihhVar5.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                                                                        aihhVar5.copyOnWrite();
                                                                        aofg aofgVar10 = (aofg) aihhVar5.instance;
                                                                        aofgVar10.e();
                                                                        aofgVar10.f.h(15);
                                                                        aihl aihlVar5 = aoom.b;
                                                                        aihf aihfVarCreateBuilder10 = aoom.a.createBuilder();
                                                                        aihfVarCreateBuilder10.copyOnWrite();
                                                                        aoom aoomVar5 = (aoom) aihfVarCreateBuilder10.instance;
                                                                        aoomVar5.c |= 16;
                                                                        aoomVar5.g = true;
                                                                        aihfVarCreateBuilder10.copyOnWrite();
                                                                        aoom aoomVar6 = (aoom) aihfVarCreateBuilder10.instance;
                                                                        aoomVar6.c |= 16384;
                                                                        aoomVar6.o = true;
                                                                        aihhVar5.e(aihlVar5, (aoom) aihfVarCreateBuilder10.build());
                                                                        aofg aofgVar11 = (aofg) aihhVar5.build();
                                                                        aihfVarCreateBuilder9.copyOnWrite();
                                                                        aofh aofhVar111 = (aofh) aihfVarCreateBuilder9.instance;
                                                                        aofgVar11.getClass();
                                                                        aofhVar111.e = aofgVar11;
                                                                        aofhVar111.b |= 4;
                                                                        aihf aihfVarCreateBuilder11 = aofhVar18.createBuilder();
                                                                        aihfVarCreateBuilder11.copyOnWrite();
                                                                        aofh aofhVar112 = (aofh) aihfVarCreateBuilder11.instance;
                                                                        aofhVar112.c = 4;
                                                                        aofhVar112.b |= 1;
                                                                        String strC3 = aatr.c(str110);
                                                                        aihfVarCreateBuilder11.copyOnWrite();
                                                                        aofh aofhVar113 = (aofh) aihfVarCreateBuilder11.instance;
                                                                        strC3.getClass();
                                                                        aofhVar113.b |= 2;
                                                                        aofhVar113.d = strC3;
                                                                        aihh aihhVar6 = (aihh) aofgVar9.createBuilder();
                                                                        aihl aihlVar6 = aqpb.b;
                                                                        aihf aihfVarCreateBuilder12 = aqpb.a.createBuilder();
                                                                        aihfVarCreateBuilder12.copyOnWrite();
                                                                        aqpb aqpbVar5 = (aqpb) aihfVarCreateBuilder12.instance;
                                                                        aqpbVar5.c |= 4;
                                                                        aqpbVar5.f = true;
                                                                        aihfVarCreateBuilder12.copyOnWrite();
                                                                        aqpb aqpbVar6 = (aqpb) aihfVarCreateBuilder12.instance;
                                                                        aqpbVar6.c |= SemanticState.Modal;
                                                                        aqpbVar6.m = true;
                                                                        aihhVar6.e(aihlVar6, (aqpb) aihfVarCreateBuilder12.build());
                                                                        aofg aofgVar12 = (aofg) aihhVar6.build();
                                                                        aihfVarCreateBuilder11.copyOnWrite();
                                                                        aofh aofhVar114 = (aofh) aihfVarCreateBuilder11.instance;
                                                                        aofgVar12.getClass();
                                                                        aofhVar114.e = aofgVar12;
                                                                        aofhVar114.b |= 4;
                                                                        aofh aofhVar115 = (aofh) aihfVarCreateBuilder11.build();
                                                                        aihfVarCreateBuilder9.copyOnWrite();
                                                                        aofhVar = (aofh) aihfVarCreateBuilder9.instance;
                                                                        aofhVar115.getClass();
                                                                        aiieVar = aofhVar.g;
                                                                        if (!aiieVar.c()) {
                                                                            aofhVar.g = aihn.mutableCopy(aiieVar);
                                                                        }
                                                                        aofhVar.g.add(aofhVar115);
                                                                        aanyVar3.a((aofh) aihfVarCreateBuilder9.build());
                                                                        aarvVar = aatnVar.e;
                                                                        str = aatnVar.i;
                                                                        aaroVarE = ((aask) aarvVar).u.e(str);
                                                                        if (aaroVarE != null) {
                                                                            aaroVarE.j = aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
                                                                            ((aask) aarvVar).f.b(str);
                                                                            ((aask) aarvVar).i.remove(str);
                                                                            ((aask) aarvVar).c.j(aaroVarE);
                                                                            ((aask) aarvVar).h();
                                                                            return;
                                                                        }
                                                                        return;
                                                                        exc = e;
                                                                        r11 = r9;
                                                                        ((agrc) ((agrc) ((agrc) c.b()).j(exc)).k(r11, "run", 183, str10)).w("[Offline] pudl task cotn [%s] error while pinning video", aatnVar.m);
                                                                        zvp.b(zvn.b, zvm.C, "VideoAd pin exception: ".concat(String.valueOf(exc.getMessage())), exc);
                                                                        aatnVar.d(new aarx(false, "Error encountered while pinning the video", exc, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON));
                                                                    }
                                                                } catch (InterruptedException e14) {
                                                                    e = e14;
                                                                    str2 = str11;
                                                                    interruptedException = e;
                                                                    str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                    r12 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                    r8 = str2;
                                                                    ((agrc) ((agrc) ((agrc) c.b()).j(interruptedException)).k(r12, r8, 467, str10)).w("[Offline] pudl task cotn [%s] error while downloading video", aatnVar.m);
                                                                    aatnVar.d(new aarx(false, "Error encountered while downloading the video", interruptedException, aamg.FAILED_UNKNOWN, aogv.OFFLINE_TRANSFER_INTERRUPTED));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        str2 = str11;
                                                        try {
                                                            it = arrayList2.iterator();
                                                            while (it.hasNext()) {
                                                                hashSet.add(((wjf) it.next()).G());
                                                            }
                                                            str3 = aatnVar.k;
                                                            z2 = aamwVar5.i;
                                                            aafuVar.b(hashSet, str3, z2);
                                                            while (r2.hasNext()) {
                                                                try {
                                                                    c3 = 2;
                                                                    boolean z9 = z2;
                                                                    aafu aafuVar3 = aafuVar;
                                                                    try {
                                                                        arrayList.add(new agew(wjfVar2, aatnVar.u.a(aatnVar.r, aatnVar.t, null, wjfVar2.G(), wjfVar2.g(), wjfVar2.f(), aafuVar3, z9)));
                                                                        aafuVar = aafuVar3;
                                                                        z2 = z9;
                                                                    } catch (aato e15) {
                                                                        e = e15;
                                                                        str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                        r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                        i = 1;
                                                                        z = aatnVar.h.i;
                                                                        aatrVar = aatnVar.u;
                                                                        if (!z) {
                                                                            aatnVar.d(aatrVar.b(e));
                                                                            return;
                                                                        }
                                                                        String str111 = aatnVar.k;
                                                                        aany aanyVar4 = (aany) aatrVar.d.io();
                                                                        aofh aofhVar116 = aofh.a;
                                                                        aihf aihfVarCreateBuilder13 = aofhVar116.createBuilder();
                                                                        aihfVarCreateBuilder13.copyOnWrite();
                                                                        aofh aofhVar117 = (aofh) aihfVarCreateBuilder13.instance;
                                                                        int i10 = i;
                                                                        aofhVar117.c = i10;
                                                                        aofhVar117.b |= i10;
                                                                        String strG7 = wfs.g(119, str111);
                                                                        aihfVarCreateBuilder13.copyOnWrite();
                                                                        aofh aofhVar118 = (aofh) aihfVarCreateBuilder13.instance;
                                                                        strG7.getClass();
                                                                        aofhVar118.b |= 2;
                                                                        aofhVar118.d = strG7;
                                                                        aofg aofgVar13 = aofg.b;
                                                                        aihh aihhVar7 = (aihh) aofgVar13.createBuilder();
                                                                        aihhVar7.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                                                                        aihhVar7.copyOnWrite();
                                                                        aofg aofgVar14 = (aofg) aihhVar7.instance;
                                                                        aofgVar14.e();
                                                                        aofgVar14.f.h(15);
                                                                        aihl aihlVar7 = aoom.b;
                                                                        aihf aihfVarCreateBuilder14 = aoom.a.createBuilder();
                                                                        aihfVarCreateBuilder14.copyOnWrite();
                                                                        aoom aoomVar7 = (aoom) aihfVarCreateBuilder14.instance;
                                                                        aoomVar7.c |= 16;
                                                                        aoomVar7.g = true;
                                                                        aihfVarCreateBuilder14.copyOnWrite();
                                                                        aoom aoomVar8 = (aoom) aihfVarCreateBuilder14.instance;
                                                                        aoomVar8.c |= 16384;
                                                                        aoomVar8.o = true;
                                                                        aihhVar7.e(aihlVar7, (aoom) aihfVarCreateBuilder14.build());
                                                                        aofg aofgVar15 = (aofg) aihhVar7.build();
                                                                        aihfVarCreateBuilder13.copyOnWrite();
                                                                        aofh aofhVar119 = (aofh) aihfVarCreateBuilder13.instance;
                                                                        aofgVar15.getClass();
                                                                        aofhVar119.e = aofgVar15;
                                                                        aofhVar119.b |= 4;
                                                                        aihf aihfVarCreateBuilder15 = aofhVar116.createBuilder();
                                                                        aihfVarCreateBuilder15.copyOnWrite();
                                                                        aofh aofhVar1110 = (aofh) aihfVarCreateBuilder15.instance;
                                                                        aofhVar1110.c = 4;
                                                                        aofhVar1110.b |= 1;
                                                                        String strC4 = aatr.c(str111);
                                                                        aihfVarCreateBuilder15.copyOnWrite();
                                                                        aofh aofhVar1111 = (aofh) aihfVarCreateBuilder15.instance;
                                                                        strC4.getClass();
                                                                        aofhVar1111.b |= 2;
                                                                        aofhVar1111.d = strC4;
                                                                        aihh aihhVar8 = (aihh) aofgVar13.createBuilder();
                                                                        aihl aihlVar8 = aqpb.b;
                                                                        aihf aihfVarCreateBuilder16 = aqpb.a.createBuilder();
                                                                        aihfVarCreateBuilder16.copyOnWrite();
                                                                        aqpb aqpbVar7 = (aqpb) aihfVarCreateBuilder16.instance;
                                                                        aqpbVar7.c |= 4;
                                                                        aqpbVar7.f = true;
                                                                        aihfVarCreateBuilder16.copyOnWrite();
                                                                        aqpb aqpbVar8 = (aqpb) aihfVarCreateBuilder16.instance;
                                                                        aqpbVar8.c |= SemanticState.Modal;
                                                                        aqpbVar8.m = true;
                                                                        aihhVar8.e(aihlVar8, (aqpb) aihfVarCreateBuilder16.build());
                                                                        aofg aofgVar16 = (aofg) aihhVar8.build();
                                                                        aihfVarCreateBuilder15.copyOnWrite();
                                                                        aofh aofhVar1112 = (aofh) aihfVarCreateBuilder15.instance;
                                                                        aofgVar16.getClass();
                                                                        aofhVar1112.e = aofgVar16;
                                                                        aofhVar1112.b |= 4;
                                                                        aofh aofhVar1113 = (aofh) aihfVarCreateBuilder15.build();
                                                                        aihfVarCreateBuilder13.copyOnWrite();
                                                                        aofhVar = (aofh) aihfVarCreateBuilder13.instance;
                                                                        aofhVar1113.getClass();
                                                                        aiieVar = aofhVar.g;
                                                                        if (!aiieVar.c()) {
                                                                            aofhVar.g = aihn.mutableCopy(aiieVar);
                                                                        }
                                                                        aofhVar.g.add(aofhVar1113);
                                                                        aanyVar4.a((aofh) aihfVarCreateBuilder13.build());
                                                                        aarvVar = aatnVar.e;
                                                                        str = aatnVar.i;
                                                                        aaroVarE = ((aask) aarvVar).u.e(str);
                                                                        if (aaroVarE != null) {
                                                                            aaroVarE.j = aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
                                                                            ((aask) aarvVar).f.b(str);
                                                                            ((aask) aarvVar).i.remove(str);
                                                                            ((aask) aarvVar).c.j(aaroVarE);
                                                                            ((aask) aarvVar).h();
                                                                            return;
                                                                        }
                                                                        return;
                                                                        exc = e;
                                                                        r11 = r9;
                                                                        ((agrc) ((agrc) ((agrc) c.b()).j(exc)).k(r11, "run", 183, str10)).w("[Offline] pudl task cotn [%s] error while pinning video", aatnVar.m);
                                                                        zvp.b(zvn.b, zvm.C, "VideoAd pin exception: ".concat(String.valueOf(exc.getMessage())), exc);
                                                                        aatnVar.d(new aarx(false, "Error encountered while pinning the video", exc, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON));
                                                                    }
                                                                } catch (aato e16) {
                                                                    e = e16;
                                                                    c3 = 2;
                                                                    str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                    r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                    i = 1;
                                                                    z = aatnVar.h.i;
                                                                    aatrVar = aatnVar.u;
                                                                    if (!z) {
                                                                        aatnVar.d(aatrVar.b(e));
                                                                        return;
                                                                    }
                                                                    String str112 = aatnVar.k;
                                                                    aany aanyVar5 = (aany) aatrVar.d.io();
                                                                    aofh aofhVar1114 = aofh.a;
                                                                    aihf aihfVarCreateBuilder17 = aofhVar1114.createBuilder();
                                                                    aihfVarCreateBuilder17.copyOnWrite();
                                                                    aofh aofhVar1115 = (aofh) aihfVarCreateBuilder17.instance;
                                                                    int i11 = i;
                                                                    aofhVar1115.c = i11;
                                                                    aofhVar1115.b |= i11;
                                                                    String strG8 = wfs.g(119, str112);
                                                                    aihfVarCreateBuilder17.copyOnWrite();
                                                                    aofh aofhVar1116 = (aofh) aihfVarCreateBuilder17.instance;
                                                                    strG8.getClass();
                                                                    aofhVar1116.b |= 2;
                                                                    aofhVar1116.d = strG8;
                                                                    aofg aofgVar17 = aofg.b;
                                                                    aihh aihhVar9 = (aihh) aofgVar17.createBuilder();
                                                                    aihhVar9.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                                                                    aihhVar9.copyOnWrite();
                                                                    aofg aofgVar18 = (aofg) aihhVar9.instance;
                                                                    aofgVar18.e();
                                                                    aofgVar18.f.h(15);
                                                                    aihl aihlVar9 = aoom.b;
                                                                    aihf aihfVarCreateBuilder18 = aoom.a.createBuilder();
                                                                    aihfVarCreateBuilder18.copyOnWrite();
                                                                    aoom aoomVar9 = (aoom) aihfVarCreateBuilder18.instance;
                                                                    aoomVar9.c |= 16;
                                                                    aoomVar9.g = true;
                                                                    aihfVarCreateBuilder18.copyOnWrite();
                                                                    aoom aoomVar10 = (aoom) aihfVarCreateBuilder18.instance;
                                                                    aoomVar10.c |= 16384;
                                                                    aoomVar10.o = true;
                                                                    aihhVar9.e(aihlVar9, (aoom) aihfVarCreateBuilder18.build());
                                                                    aofg aofgVar19 = (aofg) aihhVar9.build();
                                                                    aihfVarCreateBuilder17.copyOnWrite();
                                                                    aofh aofhVar1117 = (aofh) aihfVarCreateBuilder17.instance;
                                                                    aofgVar19.getClass();
                                                                    aofhVar1117.e = aofgVar19;
                                                                    aofhVar1117.b |= 4;
                                                                    aihf aihfVarCreateBuilder19 = aofhVar1114.createBuilder();
                                                                    aihfVarCreateBuilder19.copyOnWrite();
                                                                    aofh aofhVar1118 = (aofh) aihfVarCreateBuilder19.instance;
                                                                    aofhVar1118.c = 4;
                                                                    aofhVar1118.b |= 1;
                                                                    String strC5 = aatr.c(str112);
                                                                    aihfVarCreateBuilder19.copyOnWrite();
                                                                    aofh aofhVar1119 = (aofh) aihfVarCreateBuilder19.instance;
                                                                    strC5.getClass();
                                                                    aofhVar1119.b |= 2;
                                                                    aofhVar1119.d = strC5;
                                                                    aihh aihhVar10 = (aihh) aofgVar17.createBuilder();
                                                                    aihl aihlVar10 = aqpb.b;
                                                                    aihf aihfVarCreateBuilder110 = aqpb.a.createBuilder();
                                                                    aihfVarCreateBuilder110.copyOnWrite();
                                                                    aqpb aqpbVar9 = (aqpb) aihfVarCreateBuilder110.instance;
                                                                    aqpbVar9.c |= 4;
                                                                    aqpbVar9.f = true;
                                                                    aihfVarCreateBuilder110.copyOnWrite();
                                                                    aqpb aqpbVar10 = (aqpb) aihfVarCreateBuilder110.instance;
                                                                    aqpbVar10.c |= SemanticState.Modal;
                                                                    aqpbVar10.m = true;
                                                                    aihhVar10.e(aihlVar10, (aqpb) aihfVarCreateBuilder110.build());
                                                                    aofg aofgVar110 = (aofg) aihhVar10.build();
                                                                    aihfVarCreateBuilder19.copyOnWrite();
                                                                    aofh aofhVar11110 = (aofh) aihfVarCreateBuilder19.instance;
                                                                    aofgVar110.getClass();
                                                                    aofhVar11110.e = aofgVar110;
                                                                    aofhVar11110.b |= 4;
                                                                    aofh aofhVar11111 = (aofh) aihfVarCreateBuilder19.build();
                                                                    aihfVarCreateBuilder17.copyOnWrite();
                                                                    aofhVar = (aofh) aihfVarCreateBuilder17.instance;
                                                                    aofhVar11111.getClass();
                                                                    aiieVar = aofhVar.g;
                                                                    if (!aiieVar.c()) {
                                                                        aofhVar.g = aihn.mutableCopy(aiieVar);
                                                                    }
                                                                    aofhVar.g.add(aofhVar11111);
                                                                    aanyVar5.a((aofh) aihfVarCreateBuilder17.build());
                                                                    aarvVar = aatnVar.e;
                                                                    str = aatnVar.i;
                                                                    aaroVarE = ((aask) aarvVar).u.e(str);
                                                                    if (aaroVarE != null) {
                                                                        aaroVarE.j = aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
                                                                        ((aask) aarvVar).f.b(str);
                                                                        ((aask) aarvVar).i.remove(str);
                                                                        ((aask) aarvVar).c.j(aaroVarE);
                                                                        ((aask) aarvVar).h();
                                                                        return;
                                                                    }
                                                                    return;
                                                                    exc = e;
                                                                    r11 = r9;
                                                                    ((agrc) ((agrc) ((agrc) c.b()).j(exc)).k(r11, "run", 183, str10)).w("[Offline] pudl task cotn [%s] error while pinning video", aatnVar.m);
                                                                    zvp.b(zvn.b, zvm.C, "VideoAd pin exception: ".concat(String.valueOf(exc.getMessage())), exc);
                                                                    aatnVar.d(new aarx(false, "Error encountered while pinning the video", exc, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON));
                                                                }
                                                            }
                                                            z3 = z2;
                                                            c3 = 2;
                                                            j2 = aammVarA.c;
                                                            j3 = aammVarA.d;
                                                            it2 = arrayList.iterator();
                                                            while (it2.hasNext()) {
                                                                aamm aammVar3 = (aamm) ((agew) it2.next()).b;
                                                                aamw aamwVar7 = aamwVar5;
                                                                j2 += aammVar3.c;
                                                                j3 += aammVar3.d;
                                                                aamwVar5 = aamwVar7;
                                                                c3 = 2;
                                                            }
                                                            aamwVar = aamwVar5;
                                                            if (j3 > j2) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            aatpVar = aatnVar.o;
                                                            aatpVar.c = j3;
                                                            aatpVar.b = 0L;
                                                            aarv aarvVar4 = aatnVar.e;
                                                            String str26 = aatnVar.i;
                                                            try {
                                                                aasi aasiVarA3 = aasj.a(6);
                                                                aasiVarA3.f(str26);
                                                                aasiVarA3.g(j3);
                                                                ((aask) aarvVar4).f(aasiVarA3.a());
                                                                aatnVar = this;
                                                                String str27 = str2;
                                                                i5 = 1;
                                                                try {
                                                                    try {
                                                                        aatnVar.b(j2, 0.0d, z4);
                                                                        if (!arrayList.isEmpty()) {
                                                                            try {
                                                                                it3 = arrayList.iterator();
                                                                                while (it3.hasNext()) {
                                                                                    agew agewVar2 = (agew) it3.next();
                                                                                    wjf wjfVar4 = (wjf) agewVar2.a;
                                                                                    aammVar = (aamm) agewVar2.b;
                                                                                    grjVarC = aatnVar.b.C();
                                                                                    str4 = (String) grjVarC.w().f();
                                                                                    i = i5;
                                                                                    try {
                                                                                        ynwVarA = aatnVar.n;
                                                                                        if (ynwVarA == null) {
                                                                                            ynwVarA = ((aatj) grjVarC.a).a();
                                                                                            ynwVarA.b = aatpVar;
                                                                                            aatnVar.n = ynwVarA;
                                                                                        }
                                                                                        ynwVar = ynwVarA;
                                                                                        strG = wjfVar4.G();
                                                                                        aatpVar.a = strG;
                                                                                        aamlVar = aammVar.a;
                                                                                        if (aamlVar != null) {
                                                                                            aatr aatrVar9 = aatnVar.u;
                                                                                            String str28 = aatnVar.j;
                                                                                            long jB5 = aamlVar.b();
                                                                                            aafu aafuVarF6 = aatnVar.f.f();
                                                                                            aatt aattVar5 = aatnVar.p;
                                                                                            str5 = strG;
                                                                                            aatrVar9.g(str5, str28, ynwVar, aamlVar, jB5, aafuVarF6, str4, aattVar5.c, aattVar5.a, aatnVar.A);
                                                                                            aatpVar.b += aamlVar.b();
                                                                                        } else {
                                                                                            str5 = strG;
                                                                                        }
                                                                                        if (!aatnVar.z && (aamlVar2 = aammVar.b) != null) {
                                                                                            aatr aatrVar10 = aatnVar.u;
                                                                                            String str29 = aatnVar.j;
                                                                                            long jB6 = aamlVar2.b();
                                                                                            aafu aafuVarF7 = aatnVar.f.f();
                                                                                            aatt aattVar6 = aatnVar.p;
                                                                                            aatrVar10.g(str5, str29, ynwVar, aamlVar2, jB6, aafuVarF7, str4, aattVar6.d, aattVar6.b, aatnVar.A);
                                                                                            aatpVar.b += aamlVar2.b();
                                                                                        }
                                                                                        if (!aatnVar.z) {
                                                                                            return;
                                                                                        }
                                                                                        it3 = it3;
                                                                                        i5 = i;
                                                                                    } catch (aato e17) {
                                                                                        e = e17;
                                                                                        str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                                        r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                                        z = aatnVar.h.i;
                                                                                        aatrVar = aatnVar.u;
                                                                                        if (!z) {
                                                                                            aatnVar.d(aatrVar.b(e));
                                                                                            return;
                                                                                        }
                                                                                        String str113 = aatnVar.k;
                                                                                        aany aanyVar6 = (aany) aatrVar.d.io();
                                                                                        aofh aofhVar11112 = aofh.a;
                                                                                        aihf aihfVarCreateBuilder111 = aofhVar11112.createBuilder();
                                                                                        aihfVarCreateBuilder111.copyOnWrite();
                                                                                        aofh aofhVar11113 = (aofh) aihfVarCreateBuilder111.instance;
                                                                                        int i12 = i;
                                                                                        aofhVar11113.c = i12;
                                                                                        aofhVar11113.b |= i12;
                                                                                        String strG9 = wfs.g(119, str113);
                                                                                        aihfVarCreateBuilder111.copyOnWrite();
                                                                                        aofh aofhVar11114 = (aofh) aihfVarCreateBuilder111.instance;
                                                                                        strG9.getClass();
                                                                                        aofhVar11114.b |= 2;
                                                                                        aofhVar11114.d = strG9;
                                                                                        aofg aofgVar111 = aofg.b;
                                                                                        aihh aihhVar11 = (aihh) aofgVar111.createBuilder();
                                                                                        aihhVar11.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                                                                                        aihhVar11.copyOnWrite();
                                                                                        aofg aofgVar112 = (aofg) aihhVar11.instance;
                                                                                        aofgVar112.e();
                                                                                        aofgVar112.f.h(15);
                                                                                        aihl aihlVar11 = aoom.b;
                                                                                        aihf aihfVarCreateBuilder112 = aoom.a.createBuilder();
                                                                                        aihfVarCreateBuilder112.copyOnWrite();
                                                                                        aoom aoomVar11 = (aoom) aihfVarCreateBuilder112.instance;
                                                                                        aoomVar11.c |= 16;
                                                                                        aoomVar11.g = true;
                                                                                        aihfVarCreateBuilder112.copyOnWrite();
                                                                                        aoom aoomVar12 = (aoom) aihfVarCreateBuilder112.instance;
                                                                                        aoomVar12.c |= 16384;
                                                                                        aoomVar12.o = true;
                                                                                        aihhVar11.e(aihlVar11, (aoom) aihfVarCreateBuilder112.build());
                                                                                        aofg aofgVar113 = (aofg) aihhVar11.build();
                                                                                        aihfVarCreateBuilder111.copyOnWrite();
                                                                                        aofh aofhVar11115 = (aofh) aihfVarCreateBuilder111.instance;
                                                                                        aofgVar113.getClass();
                                                                                        aofhVar11115.e = aofgVar113;
                                                                                        aofhVar11115.b |= 4;
                                                                                        aihf aihfVarCreateBuilder113 = aofhVar11112.createBuilder();
                                                                                        aihfVarCreateBuilder113.copyOnWrite();
                                                                                        aofh aofhVar11116 = (aofh) aihfVarCreateBuilder113.instance;
                                                                                        aofhVar11116.c = 4;
                                                                                        aofhVar11116.b |= 1;
                                                                                        String strC6 = aatr.c(str113);
                                                                                        aihfVarCreateBuilder113.copyOnWrite();
                                                                                        aofh aofhVar11117 = (aofh) aihfVarCreateBuilder113.instance;
                                                                                        strC6.getClass();
                                                                                        aofhVar11117.b |= 2;
                                                                                        aofhVar11117.d = strC6;
                                                                                        aihh aihhVar12 = (aihh) aofgVar111.createBuilder();
                                                                                        aihl aihlVar12 = aqpb.b;
                                                                                        aihf aihfVarCreateBuilder114 = aqpb.a.createBuilder();
                                                                                        aihfVarCreateBuilder114.copyOnWrite();
                                                                                        aqpb aqpbVar11 = (aqpb) aihfVarCreateBuilder114.instance;
                                                                                        aqpbVar11.c |= 4;
                                                                                        aqpbVar11.f = true;
                                                                                        aihfVarCreateBuilder114.copyOnWrite();
                                                                                        aqpb aqpbVar12 = (aqpb) aihfVarCreateBuilder114.instance;
                                                                                        aqpbVar12.c |= SemanticState.Modal;
                                                                                        aqpbVar12.m = true;
                                                                                        aihhVar12.e(aihlVar12, (aqpb) aihfVarCreateBuilder114.build());
                                                                                        aofg aofgVar114 = (aofg) aihhVar12.build();
                                                                                        aihfVarCreateBuilder113.copyOnWrite();
                                                                                        aofh aofhVar11118 = (aofh) aihfVarCreateBuilder113.instance;
                                                                                        aofgVar114.getClass();
                                                                                        aofhVar11118.e = aofgVar114;
                                                                                        aofhVar11118.b |= 4;
                                                                                        aofh aofhVar11119 = (aofh) aihfVarCreateBuilder113.build();
                                                                                        aihfVarCreateBuilder111.copyOnWrite();
                                                                                        aofhVar = (aofh) aihfVarCreateBuilder111.instance;
                                                                                        aofhVar11119.getClass();
                                                                                        aiieVar = aofhVar.g;
                                                                                        if (!aiieVar.c()) {
                                                                                            aofhVar.g = aihn.mutableCopy(aiieVar);
                                                                                        }
                                                                                        aofhVar.g.add(aofhVar11119);
                                                                                        aanyVar6.a((aofh) aihfVarCreateBuilder111.build());
                                                                                        aarvVar = aatnVar.e;
                                                                                        str = aatnVar.i;
                                                                                        aaroVarE = ((aask) aarvVar).u.e(str);
                                                                                        if (aaroVarE != null) {
                                                                                            aaroVarE.j = aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
                                                                                            ((aask) aarvVar).f.b(str);
                                                                                            ((aask) aarvVar).i.remove(str);
                                                                                            ((aask) aarvVar).c.j(aaroVarE);
                                                                                            ((aask) aarvVar).h();
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                        exc = e;
                                                                                        r11 = r9;
                                                                                        ((agrc) ((agrc) ((agrc) c.b()).j(exc)).k(r11, "run", 183, str10)).w("[Offline] pudl task cotn [%s] error while pinning video", aatnVar.m);
                                                                                        zvp.b(zvn.b, zvm.C, "VideoAd pin exception: ".concat(String.valueOf(exc.getMessage())), exc);
                                                                                        aatnVar.d(new aarx(false, "Error encountered while pinning the video", exc, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON));
                                                                                    }
                                                                                }
                                                                            } catch (InterruptedException e18) {
                                                                                interruptedException = e18;
                                                                                str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                                r12 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                                r8 = str27;
                                                                            }
                                                                        }
                                                                        aalfVarG = aatnVar.f.g();
                                                                        if (aalfVarG != null) {
                                                                            j3 = j3;
                                                                            ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask", "downloadSubtitlesAndVideoStreams", 556, "OfflineVideoAdThumbnailTransferTask.java")).w("[Offline] pudl task cotn [%s] subtitle failed, no filestore", aatnVar.m);
                                                                        } else if (z3) {
                                                                            aatrVar2 = aatnVar.u;
                                                                            zwaVar = aamwVar.j;
                                                                            String strG10 = wjfVar.G();
                                                                            if (zwaVar.h()) {
                                                                                wcn wcnVarB2 = aatrVar2.c.b(zwaVar);
                                                                                try {
                                                                                    acccVarE2 = accc.e(wjfVar, aatrVar2.b);
                                                                                    if (acccVarE2 != null || (aqphVar = (aqph) wcnVarB2.g(aatr.c(str3)).g(aqph.class).E()) == null) {
                                                                                        j3 = j3;
                                                                                    } else {
                                                                                        List listH2 = aqphVar.h();
                                                                                        List<acca> listH3 = acccVarE2.h();
                                                                                        if (listH3.isEmpty()) {
                                                                                            j3 = j3;
                                                                                        } else {
                                                                                            wer werVarE = wcnVarB2.e();
                                                                                            aqpf aqpfVarD = aqphVar.d();
                                                                                            for (acca accaVar2 : listH3) {
                                                                                                j3 = j3;
                                                                                                try {
                                                                                                    String strG11 = wfs.g(225, String.valueOf(accaVar2.d).concat(String.valueOf(accaVar2.k)));
                                                                                                    if (!listH2.contains(strG11) && !accaVar2.g()) {
                                                                                                        String strK = aalfVarG.k(strG10, accaVar2);
                                                                                                        strG11.getClass();
                                                                                                        ahno.P(!strG11.isEmpty(), "key cannot be empty");
                                                                                                        aihf aihfVarCreateBuilder20 = ajoh.a.createBuilder();
                                                                                                        aihfVarCreateBuilder20.copyOnWrite();
                                                                                                        ajoh ajohVar = (ajoh) aihfVarCreateBuilder20.instance;
                                                                                                        str9 = strG10;
                                                                                                        try {
                                                                                                            ajohVar.b |= 1;
                                                                                                            ajohVar.c = strG11;
                                                                                                            ajoe ajoeVar = new ajoe(aihfVarCreateBuilder20);
                                                                                                            aihf aihfVar = ajoeVar.a;
                                                                                                            aihfVar.copyOnWrite();
                                                                                                            ajoh ajohVar2 = (ajoh) aihfVar.instance;
                                                                                                            strK.getClass();
                                                                                                            ajohVar2.b |= 2;
                                                                                                            ajohVar2.d = strK;
                                                                                                            aihh aihhVar13 = aqpfVarD.a;
                                                                                                            aihhVar13.copyOnWrite();
                                                                                                            aqpi aqpiVar = (aqpi) aihhVar13.instance;
                                                                                                            aihw aihwVar = aqpi.a;
                                                                                                            strG11.getClass();
                                                                                                            aiie aiieVar3 = aqpiVar.o;
                                                                                                            if (!aiieVar3.c()) {
                                                                                                                aqpiVar.o = aihn.mutableCopy(aiieVar3);
                                                                                                            }
                                                                                                            aqpiVar.o.add(strG11);
                                                                                                            werVarE.m(ajoeVar);
                                                                                                            strG10 = str9;
                                                                                                        } catch (IOException e19) {
                                                                                                            e = e19;
                                                                                                            ((agrc) ((agrc) ((agrc) aatr.a.c()).j(e)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoSubtitlesEntity", (char) 987, "TransferTaskUtil.java")).w("[Offline] Failed saving video subtitles entities %s", str9);
                                                                                                            aarvVar2 = aatnVar.e;
                                                                                                            str6 = aatnVar.i;
                                                                                                            aasi aasiVarA4 = aasj.a(18);
                                                                                                            aasiVarA4.f(str6);
                                                                                                            ((aask) aarvVar2).f(aasiVarA4.a());
                                                                                                            grjVarC2 = aatnVar.b.C();
                                                                                                            str7 = (String) grjVarC2.w().f();
                                                                                                            ynwVarA2 = aatnVar.n;
                                                                                                            if (ynwVarA2 == null) {
                                                                                                                ynwVarA2 = ((aatj) grjVarC2.a).a();
                                                                                                                ynwVarA2.b = aatnVar.o;
                                                                                                                aatnVar.n = ynwVarA2;
                                                                                                            }
                                                                                                            ynwVar2 = ynwVarA2;
                                                                                                            aatpVar2 = aatnVar.o;
                                                                                                            aatpVar2.a = str3;
                                                                                                            aamlVar3 = aammVarA.b;
                                                                                                            zF = f(aamlVar3, z4);
                                                                                                            if (aamlVar3 != null) {
                                                                                                                aatr aatrVar11 = aatnVar.u;
                                                                                                                String str210 = aatnVar.j;
                                                                                                                long jB7 = aamlVar3.b();
                                                                                                                aafu aafuVarF8 = aatnVar.f.f();
                                                                                                                aatt aattVar7 = aatnVar.p;
                                                                                                                str8 = str3;
                                                                                                                aatrVar11.g(str8, str210, ynwVar2, aamlVar3, jB7, aafuVarF8, str7, aattVar7.d, aattVar7.b, aatnVar.A);
                                                                                                                aatpVar2.b += aamlVar3.b();
                                                                                                            } else {
                                                                                                                str8 = str3;
                                                                                                            }
                                                                                                            if (!aatnVar.z) {
                                                                                                                aamlVar4 = aammVarA.a;
                                                                                                                zF2 = f(aamlVar4, zF);
                                                                                                                if (aamlVar4 != null) {
                                                                                                                    aatr aatrVar12 = aatnVar.u;
                                                                                                                    String str211 = aatnVar.j;
                                                                                                                    long jB8 = aamlVar4.b();
                                                                                                                    aafu aafuVarF9 = aatnVar.f.f();
                                                                                                                    aatt aattVar8 = aatnVar.p;
                                                                                                                    aatrVar12.g(str8, str211, ynwVar2, aamlVar4, jB8, aafuVarF9, str7, aattVar8.c, aattVar8.a, aatnVar.A);
                                                                                                                    aatpVar2.b += aamlVar4.b();
                                                                                                                }
                                                                                                                if (!aatnVar.z) {
                                                                                                                    aatnVar.b(j3, 0.0d, zF2);
                                                                                                                    if (aaewVarD != null) {
                                                                                                                        aaewVarD.W(str8, aatnVar.q.f().toEpochMilli());
                                                                                                                    }
                                                                                                                    aarvVar2.a(str6, aatnVar.c());
                                                                                                                }
                                                                                                            }
                                                                                                            zgjVar = aatnVar.a;
                                                                                                            if (zgjVar != null) {
                                                                                                                zgjVar.e();
                                                                                                                return;
                                                                                                            }
                                                                                                            return;
                                                                                                        } catch (ExecutionException e20) {
                                                                                                            e = e20;
                                                                                                            ((agrc) ((agrc) ((agrc) aatr.a.c()).j(e)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoSubtitlesEntity", (char) 987, "TransferTaskUtil.java")).w("[Offline] Failed saving video subtitles entities %s", str9);
                                                                                                            aarvVar2 = aatnVar.e;
                                                                                                            str6 = aatnVar.i;
                                                                                                            aasi aasiVarA5 = aasj.a(18);
                                                                                                            aasiVarA5.f(str6);
                                                                                                            ((aask) aarvVar2).f(aasiVarA5.a());
                                                                                                            grjVarC2 = aatnVar.b.C();
                                                                                                            str7 = (String) grjVarC2.w().f();
                                                                                                            ynwVarA2 = aatnVar.n;
                                                                                                            if (ynwVarA2 == null) {
                                                                                                                ynwVarA2 = ((aatj) grjVarC2.a).a();
                                                                                                                ynwVarA2.b = aatnVar.o;
                                                                                                                aatnVar.n = ynwVarA2;
                                                                                                            }
                                                                                                            ynwVar2 = ynwVarA2;
                                                                                                            aatpVar2 = aatnVar.o;
                                                                                                            aatpVar2.a = str3;
                                                                                                            aamlVar3 = aammVarA.b;
                                                                                                            zF = f(aamlVar3, z4);
                                                                                                            if (aamlVar3 != null) {
                                                                                                                aatr aatrVar13 = aatnVar.u;
                                                                                                                String str212 = aatnVar.j;
                                                                                                                long jB9 = aamlVar3.b();
                                                                                                                aafu aafuVarF10 = aatnVar.f.f();
                                                                                                                aatt aattVar9 = aatnVar.p;
                                                                                                                str8 = str3;
                                                                                                                aatrVar13.g(str8, str212, ynwVar2, aamlVar3, jB9, aafuVarF10, str7, aattVar9.d, aattVar9.b, aatnVar.A);
                                                                                                                aatpVar2.b += aamlVar3.b();
                                                                                                            } else {
                                                                                                                str8 = str3;
                                                                                                            }
                                                                                                            if (!aatnVar.z) {
                                                                                                                aamlVar4 = aammVarA.a;
                                                                                                                zF2 = f(aamlVar4, zF);
                                                                                                                if (aamlVar4 != null) {
                                                                                                                    aatr aatrVar14 = aatnVar.u;
                                                                                                                    String str213 = aatnVar.j;
                                                                                                                    long jB10 = aamlVar4.b();
                                                                                                                    aafu aafuVarF11 = aatnVar.f.f();
                                                                                                                    aatt aattVar10 = aatnVar.p;
                                                                                                                    aatrVar14.g(str8, str213, ynwVar2, aamlVar4, jB10, aafuVarF11, str7, aattVar10.c, aattVar10.a, aatnVar.A);
                                                                                                                    aatpVar2.b += aamlVar4.b();
                                                                                                                }
                                                                                                                if (!aatnVar.z) {
                                                                                                                    aatnVar.b(j3, 0.0d, zF2);
                                                                                                                    if (aaewVarD != null) {
                                                                                                                        aaewVarD.W(str8, aatnVar.q.f().toEpochMilli());
                                                                                                                    }
                                                                                                                    aarvVar2.a(str6, aatnVar.c());
                                                                                                                }
                                                                                                            }
                                                                                                            zgjVar = aatnVar.a;
                                                                                                            if (zgjVar != null) {
                                                                                                                zgjVar.e();
                                                                                                                return;
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (IOException e21) {
                                                                                                    e = e21;
                                                                                                    str9 = strG10;
                                                                                                    ((agrc) ((agrc) ((agrc) aatr.a.c()).j(e)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoSubtitlesEntity", (char) 987, "TransferTaskUtil.java")).w("[Offline] Failed saving video subtitles entities %s", str9);
                                                                                                    aarvVar2 = aatnVar.e;
                                                                                                    str6 = aatnVar.i;
                                                                                                    aasi aasiVarA6 = aasj.a(18);
                                                                                                    aasiVarA6.f(str6);
                                                                                                    ((aask) aarvVar2).f(aasiVarA6.a());
                                                                                                    grjVarC2 = aatnVar.b.C();
                                                                                                    str7 = (String) grjVarC2.w().f();
                                                                                                    ynwVarA2 = aatnVar.n;
                                                                                                    if (ynwVarA2 == null) {
                                                                                                        ynwVarA2 = ((aatj) grjVarC2.a).a();
                                                                                                        ynwVarA2.b = aatnVar.o;
                                                                                                        aatnVar.n = ynwVarA2;
                                                                                                    }
                                                                                                    ynwVar2 = ynwVarA2;
                                                                                                    aatpVar2 = aatnVar.o;
                                                                                                    aatpVar2.a = str3;
                                                                                                    aamlVar3 = aammVarA.b;
                                                                                                    zF = f(aamlVar3, z4);
                                                                                                    if (aamlVar3 != null) {
                                                                                                        aatr aatrVar15 = aatnVar.u;
                                                                                                        String str214 = aatnVar.j;
                                                                                                        long jB11 = aamlVar3.b();
                                                                                                        aafu aafuVarF12 = aatnVar.f.f();
                                                                                                        aatt aattVar11 = aatnVar.p;
                                                                                                        str8 = str3;
                                                                                                        aatrVar15.g(str8, str214, ynwVar2, aamlVar3, jB11, aafuVarF12, str7, aattVar11.d, aattVar11.b, aatnVar.A);
                                                                                                        aatpVar2.b += aamlVar3.b();
                                                                                                    } else {
                                                                                                        str8 = str3;
                                                                                                    }
                                                                                                    if (!aatnVar.z) {
                                                                                                        aamlVar4 = aammVarA.a;
                                                                                                        zF2 = f(aamlVar4, zF);
                                                                                                        if (aamlVar4 != null) {
                                                                                                            aatr aatrVar16 = aatnVar.u;
                                                                                                            String str215 = aatnVar.j;
                                                                                                            long jB12 = aamlVar4.b();
                                                                                                            aafu aafuVarF13 = aatnVar.f.f();
                                                                                                            aatt aattVar12 = aatnVar.p;
                                                                                                            aatrVar16.g(str8, str215, ynwVar2, aamlVar4, jB12, aafuVarF13, str7, aattVar12.c, aattVar12.a, aatnVar.A);
                                                                                                            aatpVar2.b += aamlVar4.b();
                                                                                                        }
                                                                                                        if (!aatnVar.z) {
                                                                                                            aatnVar.b(j3, 0.0d, zF2);
                                                                                                            if (aaewVarD != null) {
                                                                                                                aaewVarD.W(str8, aatnVar.q.f().toEpochMilli());
                                                                                                            }
                                                                                                            aarvVar2.a(str6, aatnVar.c());
                                                                                                        }
                                                                                                    }
                                                                                                    zgjVar = aatnVar.a;
                                                                                                    if (zgjVar != null) {
                                                                                                        zgjVar.e();
                                                                                                        return;
                                                                                                    }
                                                                                                    return;
                                                                                                } catch (ExecutionException e22) {
                                                                                                    e = e22;
                                                                                                    str9 = strG10;
                                                                                                    ((agrc) ((agrc) ((agrc) aatr.a.c()).j(e)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoSubtitlesEntity", (char) 987, "TransferTaskUtil.java")).w("[Offline] Failed saving video subtitles entities %s", str9);
                                                                                                    aarvVar2 = aatnVar.e;
                                                                                                    str6 = aatnVar.i;
                                                                                                    aasi aasiVarA7 = aasj.a(18);
                                                                                                    aasiVarA7.f(str6);
                                                                                                    ((aask) aarvVar2).f(aasiVarA7.a());
                                                                                                    grjVarC2 = aatnVar.b.C();
                                                                                                    str7 = (String) grjVarC2.w().f();
                                                                                                    ynwVarA2 = aatnVar.n;
                                                                                                    if (ynwVarA2 == null) {
                                                                                                        ynwVarA2 = ((aatj) grjVarC2.a).a();
                                                                                                        ynwVarA2.b = aatnVar.o;
                                                                                                        aatnVar.n = ynwVarA2;
                                                                                                    }
                                                                                                    ynwVar2 = ynwVarA2;
                                                                                                    aatpVar2 = aatnVar.o;
                                                                                                    aatpVar2.a = str3;
                                                                                                    aamlVar3 = aammVarA.b;
                                                                                                    zF = f(aamlVar3, z4);
                                                                                                    if (aamlVar3 != null) {
                                                                                                        aatr aatrVar17 = aatnVar.u;
                                                                                                        String str216 = aatnVar.j;
                                                                                                        long jB13 = aamlVar3.b();
                                                                                                        aafu aafuVarF14 = aatnVar.f.f();
                                                                                                        aatt aattVar13 = aatnVar.p;
                                                                                                        str8 = str3;
                                                                                                        aatrVar17.g(str8, str216, ynwVar2, aamlVar3, jB13, aafuVarF14, str7, aattVar13.d, aattVar13.b, aatnVar.A);
                                                                                                        aatpVar2.b += aamlVar3.b();
                                                                                                    } else {
                                                                                                        str8 = str3;
                                                                                                    }
                                                                                                    if (!aatnVar.z) {
                                                                                                        aamlVar4 = aammVarA.a;
                                                                                                        zF2 = f(aamlVar4, zF);
                                                                                                        if (aamlVar4 != null) {
                                                                                                            aatr aatrVar18 = aatnVar.u;
                                                                                                            String str217 = aatnVar.j;
                                                                                                            long jB14 = aamlVar4.b();
                                                                                                            aafu aafuVarF15 = aatnVar.f.f();
                                                                                                            aatt aattVar14 = aatnVar.p;
                                                                                                            aatrVar18.g(str8, str217, ynwVar2, aamlVar4, jB14, aafuVarF15, str7, aattVar14.c, aattVar14.a, aatnVar.A);
                                                                                                            aatpVar2.b += aamlVar4.b();
                                                                                                        }
                                                                                                        if (!aatnVar.z) {
                                                                                                            aatnVar.b(j3, 0.0d, zF2);
                                                                                                            if (aaewVarD != null) {
                                                                                                                aaewVarD.W(str8, aatnVar.q.f().toEpochMilli());
                                                                                                            }
                                                                                                            aarvVar2.a(str6, aatnVar.c());
                                                                                                        }
                                                                                                    }
                                                                                                    zgjVar = aatnVar.a;
                                                                                                    if (zgjVar != null) {
                                                                                                        zgjVar.e();
                                                                                                        return;
                                                                                                    }
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            str9 = strG10;
                                                                                            j3 = j3;
                                                                                            werVarE.m(aqpfVarD);
                                                                                            werVarE.b().G();
                                                                                        }
                                                                                    }
                                                                                } catch (IOException | ExecutionException e23) {
                                                                                    e = e23;
                                                                                    str9 = strG10;
                                                                                    j3 = j3;
                                                                                }
                                                                            } else {
                                                                                j3 = j3;
                                                                            }
                                                                        } else {
                                                                            j3 = j3;
                                                                            if (aaewVarD != null) {
                                                                                aatr aatrVar19 = aatnVar.u;
                                                                                strG2 = wjfVar.G();
                                                                                try {
                                                                                    acccVarE = accc.e(wjfVar, aatrVar19.b);
                                                                                    if (acccVarE != null) {
                                                                                        listH = acccVarE.h();
                                                                                        listAq = aaewVarD.aq(strG2);
                                                                                        if (!listH.isEmpty()) {
                                                                                            while (r0.hasNext()) {
                                                                                                if (listAq.contains(accaVar) && !accaVar.g() && !accaVar.e()) {
                                                                                                    aaewVarD.N(accaVar.c(aalfVarG.k(strG2, accaVar)));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (IOException | RuntimeException | ExecutionException e24) {
                                                                                    zvp.b(zvn.b, zvm.C, "Offline caption download exception: ".concat(String.valueOf(e24.getMessage())), e24);
                                                                                    ((agrc) ((agrc) ((agrc) aatr.a.c()).j(e24)).k("com/google/android/libraries/youtube/offline/transfer/task/TransferTaskUtil", "saveVideoSubtitles", (char) 927, "TransferTaskUtil.java")).w("[Offline] Failed saving video subtitles %s", strG2);
                                                                                }
                                                                            } else {
                                                                                aaewVarD = aaewVar;
                                                                            }
                                                                        }
                                                                        aarvVar2 = aatnVar.e;
                                                                        str6 = aatnVar.i;
                                                                        aasi aasiVarA8 = aasj.a(18);
                                                                        aasiVarA8.f(str6);
                                                                        ((aask) aarvVar2).f(aasiVarA8.a());
                                                                        grjVarC2 = aatnVar.b.C();
                                                                        str7 = (String) grjVarC2.w().f();
                                                                        ynwVarA2 = aatnVar.n;
                                                                        if (ynwVarA2 == null) {
                                                                            ynwVarA2 = ((aatj) grjVarC2.a).a();
                                                                            ynwVarA2.b = aatnVar.o;
                                                                            aatnVar.n = ynwVarA2;
                                                                        }
                                                                        ynwVar2 = ynwVarA2;
                                                                        aatpVar2 = aatnVar.o;
                                                                        aatpVar2.a = str3;
                                                                        aamlVar3 = aammVarA.b;
                                                                        zF = f(aamlVar3, z4);
                                                                        if (aamlVar3 != null) {
                                                                            aatr aatrVar110 = aatnVar.u;
                                                                            String str218 = aatnVar.j;
                                                                            long jB15 = aamlVar3.b();
                                                                            aafu aafuVarF16 = aatnVar.f.f();
                                                                            aatt aattVar15 = aatnVar.p;
                                                                            str8 = str3;
                                                                            aatrVar110.g(str8, str218, ynwVar2, aamlVar3, jB15, aafuVarF16, str7, aattVar15.d, aattVar15.b, aatnVar.A);
                                                                            aatpVar2.b += aamlVar3.b();
                                                                        } else {
                                                                            str8 = str3;
                                                                        }
                                                                        if (!aatnVar.z) {
                                                                            aamlVar4 = aammVarA.a;
                                                                            zF2 = f(aamlVar4, zF);
                                                                            if (aamlVar4 != null) {
                                                                                aatr aatrVar111 = aatnVar.u;
                                                                                String str219 = aatnVar.j;
                                                                                long jB16 = aamlVar4.b();
                                                                                aafu aafuVarF17 = aatnVar.f.f();
                                                                                aatt aattVar16 = aatnVar.p;
                                                                                aatrVar111.g(str8, str219, ynwVar2, aamlVar4, jB16, aafuVarF17, str7, aattVar16.c, aattVar16.a, aatnVar.A);
                                                                                aatpVar2.b += aamlVar4.b();
                                                                            }
                                                                            if (!aatnVar.z) {
                                                                                aatnVar.b(j3, 0.0d, zF2);
                                                                                if (aaewVarD != null) {
                                                                                    aaewVarD.W(str8, aatnVar.q.f().toEpochMilli());
                                                                                }
                                                                                aarvVar2.a(str6, aatnVar.c());
                                                                            }
                                                                        }
                                                                        zgjVar = aatnVar.a;
                                                                        if (zgjVar != null) {
                                                                            zgjVar.e();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    } catch (InterruptedException e25) {
                                                                        e = e25;
                                                                        r9 = str27;
                                                                        str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                        r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                        interruptedException = e;
                                                                        r8 = r9;
                                                                        r12 = r9;
                                                                    }
                                                                } catch (aato e26) {
                                                                    e = e26;
                                                                    i = i5;
                                                                }
                                                            } catch (aarx e27) {
                                                                e = e27;
                                                                aatnVar = this;
                                                                aatnVar.d(e);
                                                                return;
                                                            } catch (aato e28) {
                                                                e = e28;
                                                                aatnVar = this;
                                                                str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                obj = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                r9 = obj;
                                                                i = 1;
                                                            } catch (IOException e29) {
                                                                e = e29;
                                                                aatnVar = this;
                                                                aatnVar.d(aatnVar.u.b(e));
                                                                return;
                                                            } catch (InterruptedException e30) {
                                                                e = e30;
                                                                aatnVar = this;
                                                                str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                r9 = str2;
                                                                interruptedException = e;
                                                                r8 = r9;
                                                                r12 = r9;
                                                            } catch (Exception e31) {
                                                                e = e31;
                                                                aatnVar = this;
                                                                str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                                                r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                                                exc = e;
                                                                r11 = r9;
                                                                ((agrc) ((agrc) ((agrc) c.b()).j(exc)).k(r11, "run", 183, str10)).w("[Offline] pudl task cotn [%s] error while pinning video", aatnVar.m);
                                                                zvp.b(zvn.b, zvm.C, "VideoAd pin exception: ".concat(String.valueOf(exc.getMessage())), exc);
                                                                aatnVar.d(new aarx(false, "Error encountered while pinning the video", exc, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON));
                                                            }
                                                        } catch (InterruptedException e32) {
                                                            e = e32;
                                                        }
                                                    } catch (IOException e33) {
                                                        e = e33;
                                                    }
                                                } catch (Exception e34) {
                                                    e = e34;
                                                }
                                            } catch (aarx e35) {
                                                e = e35;
                                            }
                                        } catch (aato e36) {
                                            e = e36;
                                        } catch (InterruptedException e37) {
                                            e = e37;
                                            r9 = str11;
                                        }
                                    } catch (aato e38) {
                                        e = e38;
                                        str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                        r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                    }
                                } catch (aato e39) {
                                    e = e39;
                                    c2 = 2;
                                    str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                    r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                                    i = i4;
                                }
                            } catch (aato e40) {
                                e = e40;
                                str10 = "OfflineVideoAdThumbnailTransferTask.java";
                                obj = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                            }
                            z = aatnVar.h.i;
                            aatrVar = aatnVar.u;
                            if (!z) {
                                aatnVar.d(aatrVar.b(e));
                                return;
                            }
                            String str114 = aatnVar.k;
                            aany aanyVar7 = (aany) aatrVar.d.io();
                            aofh aofhVar111110 = aofh.a;
                            aihf aihfVarCreateBuilder115 = aofhVar111110.createBuilder();
                            aihfVarCreateBuilder115.copyOnWrite();
                            aofh aofhVar111111 = (aofh) aihfVarCreateBuilder115.instance;
                            int i13 = i;
                            aofhVar111111.c = i13;
                            aofhVar111111.b |= i13;
                            String strG12 = wfs.g(119, str114);
                            aihfVarCreateBuilder115.copyOnWrite();
                            aofh aofhVar111112 = (aofh) aihfVarCreateBuilder115.instance;
                            strG12.getClass();
                            aofhVar111112.b |= 2;
                            aofhVar111112.d = strG12;
                            aofg aofgVar115 = aofg.b;
                            aihh aihhVar14 = (aihh) aofgVar115.createBuilder();
                            aihhVar14.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                            aihhVar14.copyOnWrite();
                            aofg aofgVar116 = (aofg) aihhVar14.instance;
                            aofgVar116.e();
                            aofgVar116.f.h(15);
                            aihl aihlVar13 = aoom.b;
                            aihf aihfVarCreateBuilder116 = aoom.a.createBuilder();
                            aihfVarCreateBuilder116.copyOnWrite();
                            aoom aoomVar13 = (aoom) aihfVarCreateBuilder116.instance;
                            aoomVar13.c |= 16;
                            aoomVar13.g = true;
                            aihfVarCreateBuilder116.copyOnWrite();
                            aoom aoomVar14 = (aoom) aihfVarCreateBuilder116.instance;
                            aoomVar14.c |= 16384;
                            aoomVar14.o = true;
                            aihhVar14.e(aihlVar13, (aoom) aihfVarCreateBuilder116.build());
                            aofg aofgVar117 = (aofg) aihhVar14.build();
                            aihfVarCreateBuilder115.copyOnWrite();
                            aofh aofhVar111113 = (aofh) aihfVarCreateBuilder115.instance;
                            aofgVar117.getClass();
                            aofhVar111113.e = aofgVar117;
                            aofhVar111113.b |= 4;
                            aihf aihfVarCreateBuilder117 = aofhVar111110.createBuilder();
                            aihfVarCreateBuilder117.copyOnWrite();
                            aofh aofhVar111114 = (aofh) aihfVarCreateBuilder117.instance;
                            aofhVar111114.c = 4;
                            aofhVar111114.b |= 1;
                            String strC7 = aatr.c(str114);
                            aihfVarCreateBuilder117.copyOnWrite();
                            aofh aofhVar111115 = (aofh) aihfVarCreateBuilder117.instance;
                            strC7.getClass();
                            aofhVar111115.b |= 2;
                            aofhVar111115.d = strC7;
                            aihh aihhVar15 = (aihh) aofgVar115.createBuilder();
                            aihl aihlVar14 = aqpb.b;
                            aihf aihfVarCreateBuilder118 = aqpb.a.createBuilder();
                            aihfVarCreateBuilder118.copyOnWrite();
                            aqpb aqpbVar13 = (aqpb) aihfVarCreateBuilder118.instance;
                            aqpbVar13.c |= 4;
                            aqpbVar13.f = true;
                            aihfVarCreateBuilder118.copyOnWrite();
                            aqpb aqpbVar14 = (aqpb) aihfVarCreateBuilder118.instance;
                            aqpbVar14.c |= SemanticState.Modal;
                            aqpbVar14.m = true;
                            aihhVar15.e(aihlVar14, (aqpb) aihfVarCreateBuilder118.build());
                            aofg aofgVar118 = (aofg) aihhVar15.build();
                            aihfVarCreateBuilder117.copyOnWrite();
                            aofh aofhVar111116 = (aofh) aihfVarCreateBuilder117.instance;
                            aofgVar118.getClass();
                            aofhVar111116.e = aofgVar118;
                            aofhVar111116.b |= 4;
                            aofh aofhVar111117 = (aofh) aihfVarCreateBuilder117.build();
                            aihfVarCreateBuilder115.copyOnWrite();
                            aofhVar = (aofh) aihfVarCreateBuilder115.instance;
                            aofhVar111117.getClass();
                            aiieVar = aofhVar.g;
                            if (!aiieVar.c()) {
                                aofhVar.g = aihn.mutableCopy(aiieVar);
                            }
                            aofhVar.g.add(aofhVar111117);
                            aanyVar7.a((aofh) aihfVarCreateBuilder115.build());
                            aarvVar = aatnVar.e;
                            str = aatnVar.i;
                            aaroVarE = ((aask) aarvVar).u.e(str);
                            if (aaroVarE != null) {
                                aaroVarE.j = aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
                                ((aask) aarvVar).f.b(str);
                                ((aask) aarvVar).i.remove(str);
                                ((aask) aarvVar).c.j(aaroVarE);
                                ((aask) aarvVar).h();
                                return;
                            }
                            return;
                        } catch (aarx e41) {
                            e = e41;
                        } catch (aato e42) {
                            e = e42;
                        } catch (IOException e43) {
                            e = e43;
                        } catch (InterruptedException e44) {
                            e = e44;
                        }
                    } catch (aarx e45) {
                        e = e45;
                    }
                } catch (InterruptedException e46) {
                    e = e46;
                    str10 = "OfflineVideoAdThumbnailTransferTask.java";
                    r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
                    r9 = "pinVideoInterstitialThumbnail";
                }
                interruptedException = e;
                r8 = r9;
                r12 = r9;
                ((agrc) ((agrc) ((agrc) c.b()).j(interruptedException)).k(r12, r8, 467, str10)).w("[Offline] pudl task cotn [%s] error while downloading video", aatnVar.m);
                aatnVar.d(new aarx(false, "Error encountered while downloading the video", interruptedException, aamg.FAILED_UNKNOWN, aogv.OFFLINE_TRANSFER_INTERRUPTED));
                return;
            } catch (Exception e47) {
                exc = e47;
                str10 = "OfflineVideoAdThumbnailTransferTask.java";
                r11 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
            }
        } catch (Exception e48) {
            e = e48;
            str10 = "OfflineVideoAdThumbnailTransferTask.java";
            r9 = "com/google/android/libraries/youtube/offline/transfer/task/OfflineVideoAdThumbnailTransferTask";
        }
        exc = e;
        r11 = r9;
        ((agrc) ((agrc) ((agrc) c.b()).j(exc)).k(r11, "run", 183, str10)).w("[Offline] pudl task cotn [%s] error while pinning video", aatnVar.m);
        zvp.b(zvn.b, zvm.C, "VideoAd pin exception: ".concat(String.valueOf(exc.getMessage())), exc);
        aatnVar.d(new aarx(false, "Error encountered while pinning the video", exc, aamg.FAILED_UNKNOWN, aogv.UNKNOWN_FAILURE_REASON));
    }
}
