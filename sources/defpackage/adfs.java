package defpackage;

import android.content.Context;
import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.nio.ByteBuffer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adfs {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/rendering/elements/logging/RenderNextYoutubeElementsInteractionLogger");
    public final xgn a;
    public final nuc b;
    public final boolean c;
    public final boolean d;
    public final xgz e;
    private final tqj g;
    private final float h;
    private final SparseArray i = new SparseArray();
    private final boolean j;
    private final boolean k;
    private final boolean l;

    public adfs(Context context, Optional optional, vxz vxzVar, tqj tqjVar, vxz vxzVar2, vxz vxzVar3, xgn xgnVar, akrn akrnVar) {
        this.h = context.getResources().getDisplayMetrics().density;
        this.b = (nuc) optional.orElse(null);
        this.a = xgnVar;
        this.g = tqjVar;
        boolean z = false;
        vxzVar2.l(20, 45460727L, false);
        this.k = vxzVar.l(79, 45620519L, false);
        this.l = vxzVar.l(157, 45750803L, false);
        this.c = vxzVar3 != null && vxzVar3.l(40, 45843830L, false);
        this.d = vxzVar3 != null && vxzVar3.l(70, 45855989L, false);
        if (akrnVar == null || (akrnVar.b & 8) == 0 || akrnVar.d.d() <= 0) {
            this.e = null;
        } else {
            this.e = new xgj(akrnVar.d, (amud) null);
        }
        if (vxzVar3 != null && vxzVar3.l(39, 45843506L, false)) {
            z = true;
        }
        this.j = z;
    }

    public static asbk e(atkf atkfVar) {
        return (asbk) atkfVar.d(asbk.d);
    }

    public static boolean f(atkf atkfVar) {
        return (Memory.peekByte(e(atkfVar).aR().aS().c + 8) & 2) != 0;
    }

    public static boolean g(atkf atkfVar) {
        aryh aryhVarAR = e(atkfVar).aR();
        return aryhVarAR != null && aryhVarAR.aR();
    }

    private final int j(int i) {
        return (int) (i / this.h);
    }

    private static amud k(aryh aryhVar) {
        return (amud) aihn.parseFrom(amud.b, aryhVar.f(), ExtensionRegistryLite.getGeneratedRegistry());
    }

    public final UpbArena a(UpbArena upbArena) {
        return (upbArena == null && this.c) ? new UpbArena() : upbArena;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cd A[Catch: all -> 0x00eb, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0010, B:10:0x0027, B:11:0x006a, B:25:0x00cd, B:28:0x00d3, B:33:0x00da, B:36:0x00dd, B:14:0x008c, B:16:0x0099, B:18:0x00a3, B:20:0x00b1, B:22:0x00c6, B:21:0x00b4, B:13:0x0070, B:29:0x00d4, B:30:0x00d7), top: B:51:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0010, B:10:0x0027, B:11:0x006a, B:25:0x00cd, B:28:0x00d3, B:33:0x00da, B:36:0x00dd, B:14:0x008c, B:16:0x0099, B:18:0x00a3, B:20:0x00b1, B:22:0x00c6, B:21:0x00b4, B:13:0x0070, B:29:0x00d4, B:30:0x00d7), top: B:51:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00e4, please report this as an issue */
    public final synchronized xgz b(int i, aryv aryvVar, SparseArray sparseArray) {
        xgj xgjVar;
        aigj aighVar;
        xgz xgzVarD = d(i, sparseArray);
        if (xgzVarD != null) {
            return xgzVarD;
        }
        mep mepVar = aryr.a;
        if (!aryvVar.e(mepVar)) {
            if ((Memory.peekByte(aryvVar.c + 8) & 1) == 0 || !aryvVar.aR().hasRemaining()) {
                xgjVar = null;
            } else {
                ByteBuffer byteBufferAR = aryvVar.aR();
                aigj aigjVar = aigj.d;
                int iRemaining = byteBufferAR.remaining();
                if (iRemaining == 0) {
                    aighVar = aigj.d;
                } else {
                    a.ao(0, iRemaining, byteBufferAR.remaining());
                    byte[] bArr = new byte[iRemaining];
                    byteBufferAR.get(bArr);
                    aighVar = new aigh(bArr);
                }
                xgjVar = new xgj(aighVar, (amud) null);
            }
            if (xgjVar != null) {
                return null;
            }
            if (this.j) {
                this.i.put(i, xgjVar);
            } else {
                this.i.put(i, xgjVar);
            }
            return xgjVar;
        }
        try {
            amud amudVarK = k((aryh) aryvVar.d(mepVar));
            tqj tqjVar = this.g;
            int i2 = tqr.a;
            if (tqjVar.k(1073828948)) {
                aihh aihhVar = (aihh) amudVarK.toBuilder();
                aihf aihfVarCreateBuilder = argh.a.createBuilder();
                int i3 = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN.i | amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_HIDDEN.i;
                aihfVarCreateBuilder.copyOnWrite();
                argh arghVar = (argh) aihfVarCreateBuilder.instance;
                arghVar.b |= 1;
                arghVar.c = i3;
                aihhVar.copyOnWrite();
                amud amudVar = (amud) aihhVar.instance;
                argh arghVar2 = (argh) aihfVarCreateBuilder.build();
                arghVar2.getClass();
                amudVar.e = arghVar2;
                amudVar.c |= 2;
                amudVarK = (amud) aihhVar.build();
            }
            xgjVar = new xgj(amudVarK);
        } catch (aiik unused) {
            ((agrc) ((agrc) f.c()).k("com/google/android/libraries/youtube/rendering/elements/logging/RenderNextYoutubeElementsInteractionLogger", "getLegacyVeContainer", 575, "RenderNextYoutubeElementsInteractionLogger.java")).u("LoggingNode with node id: %s has invalid LoggingDirectives", i);
            xgjVar = null;
        }
        if (xgjVar != null) {
            return null;
        }
        if (this.j || sparseArray == null) {
            this.i.put(i, xgjVar);
        } else {
            synchronized (sparseArray) {
                try {
                    sparseArray.put(i, xgjVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return xgjVar;
        throw th;
    }

    public final synchronized xgz c(int i, atkf atkfVar, SparseArray sparseArray) {
        try {
            xgz xgzVarD = d(i, sparseArray);
            if (xgzVarD != null) {
                return xgzVarD;
            }
            asbk asbkVarE = e(atkfVar);
            int iPeekInt = (g(atkfVar) && f(atkfVar)) ? Memory.peekInt(asbkVarE.aR().aS().c + 16, false) : i;
            if (asbkVarE.aS()) {
                try {
                    amud amudVarK = k(asbkVarE.aR());
                    tqj tqjVar = this.g;
                    int i2 = tqr.a;
                    xgj xgjVarA = xgj.a(amudVarK, iPeekInt, tqjVar.k(1073828948));
                    if (!this.j || sparseArray == null) {
                        this.i.put(i, xgjVarA);
                    } else {
                        synchronized (sparseArray) {
                            try {
                                sparseArray.put(i, xgjVarA);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return xgjVarA;
                } catch (aiik unused) {
                    ((agrc) ((agrc) f.c()).k("com/google/android/libraries/youtube/rendering/elements/logging/RenderNextYoutubeElementsInteractionLogger", "getVeContainerAndTrackNode", 701, "RenderNextYoutubeElementsInteractionLogger.java")).u("LoggingNode with node id: %s has invalid YouTubeLoggingProperties", i);
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized xgz d(int i, SparseArray sparseArray) {
        xgz xgzVar;
        if (this.j && sparseArray != null) {
            synchronized (sparseArray) {
                try {
                    Object obj = sparseArray.get(i);
                    xgzVar = obj instanceof xgz ? (xgz) obj : (xgz) this.i.get(i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return xgzVar;
    }

    public final amdd h(mew mewVar) {
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amda.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amda amdaVar = (amda) aihfVarCreateBuilder2.instance;
        amdaVar.b |= 1;
        amdaVar.c = true;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amda amdaVar2 = (amda) aihfVarCreateBuilder2.build();
        amdaVar2.getClass();
        amddVar.x = amdaVar2;
        amddVar.d |= 8;
        if (this.k && mewVar.aL() == 2) {
            aihf aihfVarCreateBuilder3 = amdw.a.createBuilder();
            int iJ = j(Memory.peekInt(mewVar.c + 24, false));
            aihfVarCreateBuilder3.copyOnWrite();
            amdw amdwVar = (amdw) aihfVarCreateBuilder3.instance;
            amdwVar.b |= 1;
            amdwVar.c = iJ;
            int iJ2 = j(Memory.peekInt(mewVar.c + 28, false));
            aihfVarCreateBuilder3.copyOnWrite();
            amdw amdwVar2 = (amdw) aihfVarCreateBuilder3.instance;
            amdwVar2.b |= 2;
            amdwVar2.d = iJ2;
            int iJ3 = j(Memory.peekInt(mewVar.c + 32, false));
            aihfVarCreateBuilder3.copyOnWrite();
            amdw amdwVar3 = (amdw) aihfVarCreateBuilder3.instance;
            amdwVar3.b |= 4;
            amdwVar3.e = iJ3;
            int iJ4 = j(Memory.peekInt(mewVar.c + 36, false));
            aihfVarCreateBuilder3.copyOnWrite();
            amdw amdwVar4 = (amdw) aihfVarCreateBuilder3.instance;
            amdwVar4.b |= 8;
            amdwVar4.f = iJ4;
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar2 = (amdd) aihfVarCreateBuilder.instance;
            amdw amdwVar5 = (amdw) aihfVarCreateBuilder3.build();
            amdwVar5.getClass();
            amddVar2.y = amdwVar5;
            amddVar2.d |= SemanticState.Focused;
        }
        return (amdd) aihfVarCreateBuilder.build();
    }

    public final boolean i(mew mewVar, int i) {
        if (!this.l || mewVar == null) {
            return false;
        }
        long j = i;
        return (Memory.peekLong(mewVar.c + 16, false) & j) == j;
    }
}
