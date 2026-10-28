package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xjl {
    public static final agkj a;
    public static final agkj b;
    public static final agkj c;

    static {
        final int i = 4;
        agkh agkhVar = new agkh(4);
        final int i2 = 3;
        agkhVar.e("watch", 3);
        agkhVar.e("abandoned_browse", 151);
        agkhVar.e("abandoned_watch", 45);
        final int i3 = 16;
        agkhVar.e("ad_to_video", 16);
        final int i4 = 17;
        agkhVar.e("video_to_ad", 17);
        agkhVar.e("ad_to_ad", 22);
        final int i5 = 12;
        agkhVar.e("mdx_command", 12);
        agkhVar.e("prebuffer", 40);
        agkhVar.e("mdx_cast", 120);
        agkhVar.e("ad_to_video_int", 152);
        agkhVar.e("share_video", 153);
        agkhVar.e("inline_playback", 132);
        agkhVar.e("abandoned_inline_playback", 154);
        final int i6 = 1;
        a = agkhVar.d(true);
        agkh agkhVar2 = new agkh(4);
        final int i7 = 11;
        agkhVar2.e("browse", 11);
        agkhVar2.e("search_ui", 35);
        agkhVar2.e("search", 35);
        agkhVar2.e("home_with_thumbnails", 29);
        b = agkhVar2.d(true);
        agkh agkhVar3 = new agkh(4);
        final int i8 = 18;
        agkhVar3.e("action", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i8) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i9 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i9 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i9 = 2;
        agkhVar3.e("ad_at", new xjj() { // from class: xji
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                int i10 = i9;
                if (i10 == 0) {
                    agkj agkjVar = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVar.instance;
                    amiu amiuVar2 = amiu.a;
                    amiuVar.c |= SemanticState.LiveRegion;
                    amiuVar.E = str;
                    return;
                }
                if (i10 == 1) {
                    agkj agkjVar2 = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar3 = (amiu) aihfVar.instance;
                    amiu amiuVar4 = amiu.a;
                    amiuVar3.c |= 32768;
                    amiuVar3.I = str.equals("1");
                    return;
                }
                if (i10 == 2) {
                    aihfVar.copyOnWrite();
                    amiu amiuVar5 = (amiu) aihfVar.instance;
                    amiu amiuVar6 = amiu.a;
                    amiuVar5.b |= 4194304;
                    amiuVar5.t = str;
                    List listH = agfm.b('_').h(str);
                    if (listH.size() < 2) {
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiuVar7.b |= 2097152;
                        amiuVar7.s = false;
                        return;
                    }
                    boolean zEquals = ((String) listH.get(1)).equals("2");
                    aihfVar.copyOnWrite();
                    amiu amiuVar8 = (amiu) aihfVar.instance;
                    amiuVar8.b |= 2097152;
                    amiuVar8.s = zEquals;
                    return;
                }
                if (i10 != 3) {
                    aihf aihfVarD = xjl.d(aihfVar);
                    Optional optionalA = xjl.a(str, new xjh(3), "CodecReuseMode");
                    xdd xddVar = new xdd(aihfVarD, 12);
                    if (true == optionalA.isPresent()) {
                        Object obj = optionalA.get();
                        Object obj2 = xddVar.a;
                        aihf aihfVarCreateBuilder = amiv.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar = (amiv) aihfVarCreateBuilder.instance;
                        amivVar.b |= 1;
                        amivVar.c = true;
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar2 = (amiv) aihfVarCreateBuilder.instance;
                        amivVar2.d = ((ajvt) obj).getNumber();
                        amivVar2.b |= 2;
                        ((aihf) obj2).by((amiv) aihfVarCreateBuilder.build());
                    }
                    amiw amiwVar = (amiw) aihfVarD.build();
                    aihfVar.copyOnWrite();
                    amiu amiuVar9 = (amiu) aihfVar.instance;
                    amiu amiuVar10 = amiu.a;
                    amiwVar.getClass();
                    amiuVar9.N = amiwVar;
                    amiuVar9.d |= 8;
                    return;
                }
                aihf aihfVarD2 = xjl.d(aihfVar);
                Optional optionalA2 = xjl.a(str, new xjh(2), "CodecInitReason");
                xdd xddVar2 = new xdd(aihfVarD2, 11);
                if (true == optionalA2.isPresent()) {
                    Object obj3 = optionalA2.get();
                    Object obj4 = xddVar2.a;
                    aihf aihfVarCreateBuilder2 = amiv.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar3 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar3.b |= 1;
                    amivVar3.c = false;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar4 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar4.e = ((ajvs) obj3).getNumber();
                    amivVar4.b |= 4;
                    ((aihf) obj4).by((amiv) aihfVarCreateBuilder2.build());
                }
                amiw amiwVar2 = (amiw) aihfVarD2.build();
                aihfVar.copyOnWrite();
                amiu amiuVar11 = (amiu) aihfVar.instance;
                amiu amiuVar12 = amiu.a;
                amiwVar2.getClass();
                amiuVar11.N = amiwVar2;
                amiuVar11.d |= 8;
            }
        });
        final int i10 = 6;
        agkhVar3.e("ad_cpn", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i10) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i11 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i11;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i12 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i12;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i13 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i13;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i14 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i14;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("ad_docid", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i4) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i11 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i11;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i12 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i12;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i13 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i13;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i14 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i14;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        final int i11 = 7;
        agkhVar3.e("ap", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i11) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i12 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i12 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("browse_id", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i5) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i12 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i12 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i12 = 13;
        agkhVar3.e("conn", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i12) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i13 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i13 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i13 = 14;
        agkhVar3.e("cpn", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i13) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i14 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i14 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i14 = 15;
        agkhVar3.e("csdk", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i14) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i15 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i15 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("csn", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i3) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i15 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i15 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("debug_ticks_excluded", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i4) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i15 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i15 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i15 = 19;
        agkhVar3.e("docid", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i15) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i16 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i16 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i16 = 20;
        agkhVar3.e("is_nav", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i16) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i17 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i17 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("mod_local", new xjj() { // from class: xji
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                int i17 = i6;
                if (i17 == 0) {
                    agkj agkjVar = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVar.instance;
                    amiu amiuVar2 = amiu.a;
                    amiuVar.c |= SemanticState.LiveRegion;
                    amiuVar.E = str;
                    return;
                }
                if (i17 == 1) {
                    agkj agkjVar2 = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar3 = (amiu) aihfVar.instance;
                    amiu amiuVar4 = amiu.a;
                    amiuVar3.c |= 32768;
                    amiuVar3.I = str.equals("1");
                    return;
                }
                if (i17 == 2) {
                    aihfVar.copyOnWrite();
                    amiu amiuVar5 = (amiu) aihfVar.instance;
                    amiu amiuVar6 = amiu.a;
                    amiuVar5.b |= 4194304;
                    amiuVar5.t = str;
                    List listH = agfm.b('_').h(str);
                    if (listH.size() < 2) {
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiuVar7.b |= 2097152;
                        amiuVar7.s = false;
                        return;
                    }
                    boolean zEquals = ((String) listH.get(1)).equals("2");
                    aihfVar.copyOnWrite();
                    amiu amiuVar8 = (amiu) aihfVar.instance;
                    amiuVar8.b |= 2097152;
                    amiuVar8.s = zEquals;
                    return;
                }
                if (i17 != 3) {
                    aihf aihfVarD = xjl.d(aihfVar);
                    Optional optionalA = xjl.a(str, new xjh(3), "CodecReuseMode");
                    xdd xddVar = new xdd(aihfVarD, 12);
                    if (true == optionalA.isPresent()) {
                        Object obj = optionalA.get();
                        Object obj2 = xddVar.a;
                        aihf aihfVarCreateBuilder = amiv.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar = (amiv) aihfVarCreateBuilder.instance;
                        amivVar.b |= 1;
                        amivVar.c = true;
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar2 = (amiv) aihfVarCreateBuilder.instance;
                        amivVar2.d = ((ajvt) obj).getNumber();
                        amivVar2.b |= 2;
                        ((aihf) obj2).by((amiv) aihfVarCreateBuilder.build());
                    }
                    amiw amiwVar = (amiw) aihfVarD.build();
                    aihfVar.copyOnWrite();
                    amiu amiuVar9 = (amiu) aihfVar.instance;
                    amiu amiuVar10 = amiu.a;
                    amiwVar.getClass();
                    amiuVar9.N = amiwVar;
                    amiuVar9.d |= 8;
                    return;
                }
                aihf aihfVarD2 = xjl.d(aihfVar);
                Optional optionalA2 = xjl.a(str, new xjh(2), "CodecInitReason");
                xdd xddVar2 = new xdd(aihfVarD2, 11);
                if (true == optionalA2.isPresent()) {
                    Object obj3 = optionalA2.get();
                    Object obj4 = xddVar2.a;
                    aihf aihfVarCreateBuilder2 = amiv.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar3 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar3.b |= 1;
                    amivVar3.c = false;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar4 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar4.e = ((ajvs) obj3).getNumber();
                    amivVar4.b |= 4;
                    ((aihf) obj4).by((amiv) aihfVarCreateBuilder2.build());
                }
                amiw amiwVar2 = (amiw) aihfVarD2.build();
                aihfVar.copyOnWrite();
                amiu amiuVar11 = (amiu) aihfVar.instance;
                amiu amiuVar12 = amiu.a;
                amiwVar2.getClass();
                amiuVar11.N = amiwVar2;
                amiuVar11.d |= 8;
            }
        });
        final int i17 = 0;
        agkhVar3.e("p", new xjj() { // from class: xji
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                int i18 = i17;
                if (i18 == 0) {
                    agkj agkjVar = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVar.instance;
                    amiu amiuVar2 = amiu.a;
                    amiuVar.c |= SemanticState.LiveRegion;
                    amiuVar.E = str;
                    return;
                }
                if (i18 == 1) {
                    agkj agkjVar2 = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar3 = (amiu) aihfVar.instance;
                    amiu amiuVar4 = amiu.a;
                    amiuVar3.c |= 32768;
                    amiuVar3.I = str.equals("1");
                    return;
                }
                if (i18 == 2) {
                    aihfVar.copyOnWrite();
                    amiu amiuVar5 = (amiu) aihfVar.instance;
                    amiu amiuVar6 = amiu.a;
                    amiuVar5.b |= 4194304;
                    amiuVar5.t = str;
                    List listH = agfm.b('_').h(str);
                    if (listH.size() < 2) {
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiuVar7.b |= 2097152;
                        amiuVar7.s = false;
                        return;
                    }
                    boolean zEquals = ((String) listH.get(1)).equals("2");
                    aihfVar.copyOnWrite();
                    amiu amiuVar8 = (amiu) aihfVar.instance;
                    amiuVar8.b |= 2097152;
                    amiuVar8.s = zEquals;
                    return;
                }
                if (i18 != 3) {
                    aihf aihfVarD = xjl.d(aihfVar);
                    Optional optionalA = xjl.a(str, new xjh(3), "CodecReuseMode");
                    xdd xddVar = new xdd(aihfVarD, 12);
                    if (true == optionalA.isPresent()) {
                        Object obj = optionalA.get();
                        Object obj2 = xddVar.a;
                        aihf aihfVarCreateBuilder = amiv.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar = (amiv) aihfVarCreateBuilder.instance;
                        amivVar.b |= 1;
                        amivVar.c = true;
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar2 = (amiv) aihfVarCreateBuilder.instance;
                        amivVar2.d = ((ajvt) obj).getNumber();
                        amivVar2.b |= 2;
                        ((aihf) obj2).by((amiv) aihfVarCreateBuilder.build());
                    }
                    amiw amiwVar = (amiw) aihfVarD.build();
                    aihfVar.copyOnWrite();
                    amiu amiuVar9 = (amiu) aihfVar.instance;
                    amiu amiuVar10 = amiu.a;
                    amiwVar.getClass();
                    amiuVar9.N = amiwVar;
                    amiuVar9.d |= 8;
                    return;
                }
                aihf aihfVarD2 = xjl.d(aihfVar);
                Optional optionalA2 = xjl.a(str, new xjh(2), "CodecInitReason");
                xdd xddVar2 = new xdd(aihfVarD2, 11);
                if (true == optionalA2.isPresent()) {
                    Object obj3 = optionalA2.get();
                    Object obj4 = xddVar2.a;
                    aihf aihfVarCreateBuilder2 = amiv.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar3 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar3.b |= 1;
                    amivVar3.c = false;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar4 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar4.e = ((ajvs) obj3).getNumber();
                    amivVar4.b |= 4;
                    ((aihf) obj4).by((amiv) aihfVarCreateBuilder2.build());
                }
                amiw amiwVar2 = (amiw) aihfVarD2.build();
                aihfVar.copyOnWrite();
                amiu amiuVar11 = (amiu) aihfVar.instance;
                amiu amiuVar12 = amiu.a;
                amiwVar2.getClass();
                amiuVar11.N = amiwVar2;
                amiuVar11.d |= 8;
            }
        });
        agkhVar3.e("proc", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i6) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i18 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i18;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i19 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i19;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i110 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i110;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i111 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i111;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("st", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i17) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i18 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i18;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i19 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i19;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i110 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i110;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i111 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i111;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("t", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i9) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i18 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i18;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i19 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i19;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i110 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i110;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i111 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i111;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("target_cpn", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i2) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i18 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i18;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i19 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i19;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i110 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i110;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i111 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i111;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("target_video_id", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i18 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i18;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i19 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i19;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i110 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i110;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i111 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i111;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        final int i18 = 5;
        agkhVar3.e("yt_abt", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i18) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i19 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i19;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i110;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i111 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i111;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i112;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("yt_ad", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i11) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i19 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i19;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i110;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i111 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i111;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i112;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        final int i19 = 8;
        agkhVar3.e("yt_ad_pr", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i19) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        final int i20 = 9;
        agkhVar3.e("yt_fi", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i20) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        final int i21 = 10;
        agkhVar3.e("yt_lt", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i21) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("yt_red", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i7) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("yt_vis", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i5) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("yt_vst", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i12) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("is_prefetched_response", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i13) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("query", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i14) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("upg_voice_action_string", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i3) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("upg_chip_ids_string", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i8) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        final int i22 = 19;
        agkhVar3.e("cache_bytes", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i22) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        final int i23 = 20;
        agkhVar3.e("fmt", new xjj() { // from class: xjf
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                switch (i23) {
                    case 0:
                        agkj agkjVar = xjl.a;
                        int i110 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiuVar.b |= 134217728;
                        amiuVar.v = i110;
                        break;
                    case 1:
                        agkj agkjVar2 = xjl.a;
                        int i111 = Integer.parseInt(str);
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiuVar3.c |= SemanticState.Multiline;
                        amiuVar3.G = i111;
                        break;
                    case 2:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiuVar5.c |= SemanticState.ReadOnly;
                        amiuVar5.F = str;
                        break;
                    case 3:
                        agkj agkjVar4 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiuVar7.b |= 262144;
                        amiuVar7.p = str;
                        break;
                    case 4:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiuVar9.b |= Integer.MIN_VALUE;
                        amiuVar9.y = str;
                        break;
                    case 5:
                        agkj agkjVar6 = xjl.a;
                        Optional optionalA = xjl.a(str, new xjh(0), "LatencyAdBreakType");
                        aihfVar.getClass();
                        xdd xddVar = new xdd(aihfVar, 9);
                        if (true == optionalA.isPresent()) {
                            Object obj = optionalA.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiu amiuVar11 = (amiu) aihfVar2.instance;
                            amiu amiuVar12 = amiu.a;
                            amiuVar11.z = ((amjo) obj).e;
                            amiuVar11.c |= 1;
                        }
                        break;
                    case 6:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.b |= 65536;
                        amiuVar13.o = str;
                        break;
                    case 7:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiuVar15.b |= 524288;
                        amiuVar15.q = str.equals("1");
                        break;
                    case 8:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiuVar17.b |= 1048576;
                        amiuVar17.r = str.equals("1");
                        break;
                    case 9:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amiu amiuVar20 = amiu.a;
                        amiuVar19.b |= SemanticState.LiveRegion;
                        amiuVar19.k = str.equals("1");
                        break;
                    case 10:
                        agkj agkjVar11 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar21 = (amiu) aihfVar.instance;
                        amiu amiuVar22 = amiu.a;
                        amiuVar21.b |= SemanticState.Focused;
                        amiuVar21.j = str;
                        break;
                    case 11:
                        agkj agkjVar12 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar23 = (amiu) aihfVar.instance;
                        amiu amiuVar24 = amiu.a;
                        amiuVar23.b |= 67108864;
                        amiuVar23.u = str.equals("1");
                        break;
                    case 12:
                        agkj agkjVar13 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar25 = (amiu) aihfVar.instance;
                        amiu amiuVar26 = amiu.a;
                        amiuVar25.b |= SemanticState.Multiline;
                        amiuVar25.m = str.equals("1");
                        break;
                    case 13:
                        agkj agkjVar14 = xjl.a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 99872) {
                            if (iHashCode != 116939) {
                                if (iHashCode == 3322092 && str.equals("live")) {
                                    optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_LIVE);
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                    optionalOfNullable = Optional.empty();
                                }
                            } else if (str.equals("vod")) {
                                optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_VOD);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("dvr")) {
                            optionalOfNullable = Optional.ofNullable(aqvj.VIDEO_STREAM_TYPE_DVR);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For VideoStreamType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVar.getClass();
                        xdd xddVar2 = new xdd(aihfVar, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj2 = optionalOfNullable.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiu amiuVar27 = (amiu) aihfVar3.instance;
                            amiu amiuVar28 = amiu.a;
                            amiuVar27.R = ((aqvj) obj2).e;
                            amiuVar27.d |= 65536;
                        }
                        break;
                    case 14:
                        aihf aihfVarE = xjl.e(aihfVar);
                        aihfVarE.copyOnWrite();
                        amjl amjlVar = (amjl) aihfVarE.instance;
                        amjl amjlVar2 = amjl.a;
                        amjlVar.b |= 1;
                        amjlVar.c = str.equals("1");
                        amjl amjlVar3 = (amjl) aihfVarE.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar29 = (amiu) aihfVar.instance;
                        amiu amiuVar30 = amiu.a;
                        amjlVar3.getClass();
                        amiuVar29.Q = amjlVar3;
                        amiuVar29.d |= SemanticState.Modal;
                        break;
                    case 15:
                        aihf aihfVarE2 = xjl.e(aihfVar);
                        aihfVarE2.copyOnWrite();
                        amjl amjlVar4 = (amjl) aihfVarE2.instance;
                        amjl amjlVar5 = amjl.a;
                        amjlVar4.b |= 16;
                        amjlVar4.f = str;
                        amjl amjlVar6 = (amjl) aihfVarE2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar31 = (amiu) aihfVar.instance;
                        amiu amiuVar32 = amiu.a;
                        amjlVar6.getClass();
                        amiuVar31.Q = amjlVar6;
                        amiuVar31.d |= SemanticState.Modal;
                        break;
                    case 16:
                        aihf aihfVarE3 = xjl.e(aihfVar);
                        aihfVarE3.copyOnWrite();
                        amjl amjlVar7 = (amjl) aihfVarE3.instance;
                        amjl amjlVar8 = amjl.a;
                        amjlVar7.b |= 2;
                        amjlVar7.d = str;
                        amjl amjlVar9 = (amjl) aihfVarE3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar33 = (amiu) aihfVar.instance;
                        amiu amiuVar34 = amiu.a;
                        amjlVar9.getClass();
                        amiuVar33.Q = amjlVar9;
                        amiuVar33.d |= SemanticState.Modal;
                        break;
                    case 17:
                        agkj agkjVar15 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar35 = (amiu) aihfVar.instance;
                        amiu amiuVar36 = amiu.a;
                        amiuVar35.b |= 1073741824;
                        amiuVar35.x = str;
                        break;
                    case 18:
                        aihf aihfVarE4 = xjl.e(aihfVar);
                        aihfVarE4.copyOnWrite();
                        amjl amjlVar10 = (amjl) aihfVarE4.instance;
                        amjl amjlVar11 = amjl.a;
                        amjlVar10.b |= 8;
                        amjlVar10.e = str;
                        amjl amjlVar12 = (amjl) aihfVarE4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar37 = (amiu) aihfVar.instance;
                        amiu amiuVar38 = amiu.a;
                        amjlVar12.getClass();
                        amiuVar37.Q = amjlVar12;
                        amiuVar37.d |= SemanticState.Modal;
                        break;
                    case 19:
                        aihf aihfVarD = xjl.d(aihfVar);
                        int i112 = Integer.parseInt(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= 64;
                        amiwVar.g = i112;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar39 = (amiu) aihfVar.instance;
                        amiu amiuVar40 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar39.N = amiwVar3;
                        amiuVar39.d |= 8;
                        break;
                    default:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int i113 = Integer.parseInt(str);
                        aihfVarD2.copyOnWrite();
                        amiw amiwVar4 = (amiw) aihfVarD2.instance;
                        amiw amiwVar5 = amiw.a;
                        amiwVar4.b |= 1;
                        amiwVar4.c = i113;
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar41 = (amiu) aihfVar.instance;
                        amiu amiuVar42 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar41.N = amiwVar6;
                        amiuVar41.d |= 8;
                        break;
                }
            }
        });
        agkhVar3.e("mod_pft", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i6) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("ohrtt", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i17) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("orec", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i9) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("oubpr", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i2) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("outi", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i24 = 5;
        agkhVar3.e("plt", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i24) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i25 = 6;
        agkhVar3.e("upg_player_vis", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i25) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("vis", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i19) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i26 = 9;
        agkhVar3.e("yt_pre", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i26) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        final int i27 = 10;
        agkhVar3.e("yt_wt", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i27) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("cir", new xjj() { // from class: xji
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                int i110 = i2;
                if (i110 == 0) {
                    agkj agkjVar = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVar.instance;
                    amiu amiuVar2 = amiu.a;
                    amiuVar.c |= SemanticState.LiveRegion;
                    amiuVar.E = str;
                    return;
                }
                if (i110 == 1) {
                    agkj agkjVar2 = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar3 = (amiu) aihfVar.instance;
                    amiu amiuVar4 = amiu.a;
                    amiuVar3.c |= 32768;
                    amiuVar3.I = str.equals("1");
                    return;
                }
                if (i110 == 2) {
                    aihfVar.copyOnWrite();
                    amiu amiuVar5 = (amiu) aihfVar.instance;
                    amiu amiuVar6 = amiu.a;
                    amiuVar5.b |= 4194304;
                    amiuVar5.t = str;
                    List listH = agfm.b('_').h(str);
                    if (listH.size() < 2) {
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiuVar7.b |= 2097152;
                        amiuVar7.s = false;
                        return;
                    }
                    boolean zEquals = ((String) listH.get(1)).equals("2");
                    aihfVar.copyOnWrite();
                    amiu amiuVar8 = (amiu) aihfVar.instance;
                    amiuVar8.b |= 2097152;
                    amiuVar8.s = zEquals;
                    return;
                }
                if (i110 != 3) {
                    aihf aihfVarD = xjl.d(aihfVar);
                    Optional optionalA = xjl.a(str, new xjh(3), "CodecReuseMode");
                    xdd xddVar = new xdd(aihfVarD, 12);
                    if (true == optionalA.isPresent()) {
                        Object obj = optionalA.get();
                        Object obj2 = xddVar.a;
                        aihf aihfVarCreateBuilder = amiv.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar = (amiv) aihfVarCreateBuilder.instance;
                        amivVar.b |= 1;
                        amivVar.c = true;
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar2 = (amiv) aihfVarCreateBuilder.instance;
                        amivVar2.d = ((ajvt) obj).getNumber();
                        amivVar2.b |= 2;
                        ((aihf) obj2).by((amiv) aihfVarCreateBuilder.build());
                    }
                    amiw amiwVar = (amiw) aihfVarD.build();
                    aihfVar.copyOnWrite();
                    amiu amiuVar9 = (amiu) aihfVar.instance;
                    amiu amiuVar10 = amiu.a;
                    amiwVar.getClass();
                    amiuVar9.N = amiwVar;
                    amiuVar9.d |= 8;
                    return;
                }
                aihf aihfVarD2 = xjl.d(aihfVar);
                Optional optionalA2 = xjl.a(str, new xjh(2), "CodecInitReason");
                xdd xddVar2 = new xdd(aihfVarD2, 11);
                if (true == optionalA2.isPresent()) {
                    Object obj3 = optionalA2.get();
                    Object obj4 = xddVar2.a;
                    aihf aihfVarCreateBuilder2 = amiv.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar3 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar3.b |= 1;
                    amivVar3.c = false;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar4 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar4.e = ((ajvs) obj3).getNumber();
                    amivVar4.b |= 4;
                    ((aihf) obj4).by((amiv) aihfVarCreateBuilder2.build());
                }
                amiw amiwVar2 = (amiw) aihfVarD2.build();
                aihfVar.copyOnWrite();
                amiu amiuVar11 = (amiu) aihfVar.instance;
                amiu amiuVar12 = amiu.a;
                amiwVar2.getClass();
                amiuVar11.N = amiwVar2;
                amiuVar11.d |= 8;
            }
        });
        agkhVar3.e("crm", new xjj() { // from class: xji
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                int i110 = i;
                if (i110 == 0) {
                    agkj agkjVar = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVar.instance;
                    amiu amiuVar2 = amiu.a;
                    amiuVar.c |= SemanticState.LiveRegion;
                    amiuVar.E = str;
                    return;
                }
                if (i110 == 1) {
                    agkj agkjVar2 = xjl.a;
                    aihfVar.copyOnWrite();
                    amiu amiuVar3 = (amiu) aihfVar.instance;
                    amiu amiuVar4 = amiu.a;
                    amiuVar3.c |= 32768;
                    amiuVar3.I = str.equals("1");
                    return;
                }
                if (i110 == 2) {
                    aihfVar.copyOnWrite();
                    amiu amiuVar5 = (amiu) aihfVar.instance;
                    amiu amiuVar6 = amiu.a;
                    amiuVar5.b |= 4194304;
                    amiuVar5.t = str;
                    List listH = agfm.b('_').h(str);
                    if (listH.size() < 2) {
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiuVar7.b |= 2097152;
                        amiuVar7.s = false;
                        return;
                    }
                    boolean zEquals = ((String) listH.get(1)).equals("2");
                    aihfVar.copyOnWrite();
                    amiu amiuVar8 = (amiu) aihfVar.instance;
                    amiuVar8.b |= 2097152;
                    amiuVar8.s = zEquals;
                    return;
                }
                if (i110 != 3) {
                    aihf aihfVarD = xjl.d(aihfVar);
                    Optional optionalA = xjl.a(str, new xjh(3), "CodecReuseMode");
                    xdd xddVar = new xdd(aihfVarD, 12);
                    if (true == optionalA.isPresent()) {
                        Object obj = optionalA.get();
                        Object obj2 = xddVar.a;
                        aihf aihfVarCreateBuilder = amiv.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar = (amiv) aihfVarCreateBuilder.instance;
                        amivVar.b |= 1;
                        amivVar.c = true;
                        aihfVarCreateBuilder.copyOnWrite();
                        amiv amivVar2 = (amiv) aihfVarCreateBuilder.instance;
                        amivVar2.d = ((ajvt) obj).getNumber();
                        amivVar2.b |= 2;
                        ((aihf) obj2).by((amiv) aihfVarCreateBuilder.build());
                    }
                    amiw amiwVar = (amiw) aihfVarD.build();
                    aihfVar.copyOnWrite();
                    amiu amiuVar9 = (amiu) aihfVar.instance;
                    amiu amiuVar10 = amiu.a;
                    amiwVar.getClass();
                    amiuVar9.N = amiwVar;
                    amiuVar9.d |= 8;
                    return;
                }
                aihf aihfVarD2 = xjl.d(aihfVar);
                Optional optionalA2 = xjl.a(str, new xjh(2), "CodecInitReason");
                xdd xddVar2 = new xdd(aihfVarD2, 11);
                if (true == optionalA2.isPresent()) {
                    Object obj3 = optionalA2.get();
                    Object obj4 = xddVar2.a;
                    aihf aihfVarCreateBuilder2 = amiv.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar3 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar3.b |= 1;
                    amivVar3.c = false;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiv amivVar4 = (amiv) aihfVarCreateBuilder2.instance;
                    amivVar4.e = ((ajvs) obj3).getNumber();
                    amivVar4.b |= 4;
                    ((aihf) obj4).by((amiv) aihfVarCreateBuilder2.build());
                }
                amiw amiwVar2 = (amiw) aihfVarD2.build();
                aihfVar.copyOnWrite();
                amiu amiuVar11 = (amiu) aihfVar.instance;
                amiu amiuVar12 = amiu.a;
                amiwVar2.getClass();
                amiuVar11.N = amiwVar2;
                amiuVar11.d |= 8;
            }
        });
        agkhVar3.e("canr2s", new xjj() { // from class: xjg
            /* JADX WARN: Code duplicated, block: B:119:0x03ac  */
            /* JADX WARN: Code duplicated, block: B:63:0x018e  */
            /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
            @Override // defpackage.xjj
            public final void a(String str, aihf aihfVar) {
                Optional optionalOfNullable;
                amjr amjrVar;
                switch (i7) {
                    case 0:
                        aihf aihfVarD = xjl.d(aihfVar);
                        long j = Long.parseLong(str);
                        aihfVarD.copyOnWrite();
                        amiw amiwVar = (amiw) aihfVarD.instance;
                        amiw amiwVar2 = amiw.a;
                        amiwVar.b |= SemanticState.Modal;
                        amiwVar.k = j;
                        amiw amiwVar3 = (amiw) aihfVarD.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVar.instance;
                        amiu amiuVar2 = amiu.a;
                        amiwVar3.getClass();
                        amiuVar.N = amiwVar3;
                        amiuVar.d |= 8;
                        break;
                    case 1:
                        aihf aihfVarD2 = xjl.d(aihfVar);
                        int iHashCode = str.hashCode();
                        if (iHashCode != -309211200) {
                            if (iHashCode == 94416770 && str.equals("cache")) {
                                optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE);
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                                optionalOfNullable = Optional.empty();
                            }
                        } else if (str.equals("promote")) {
                            optionalOfNullable = Optional.ofNullable(amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE);
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerPrefetchType = %s", str))), new Exception(), zvn.b);
                            optionalOfNullable = Optional.empty();
                        }
                        aihfVarD2.getClass();
                        xdd xddVar = new xdd(aihfVarD2, 10);
                        if (true == optionalOfNullable.isPresent()) {
                            Object obj = optionalOfNullable.get();
                            aihf aihfVar2 = (aihf) xddVar.a;
                            aihfVar2.copyOnWrite();
                            amiw amiwVar4 = (amiw) aihfVar2.instance;
                            amiw amiwVar5 = amiw.a;
                            amiwVar4.d = ((amjp) obj).d;
                            amiwVar4.b |= 4;
                        }
                        amiw amiwVar6 = (amiw) aihfVarD2.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar3 = (amiu) aihfVar.instance;
                        amiu amiuVar4 = amiu.a;
                        amiwVar6.getClass();
                        amiuVar3.N = amiwVar6;
                        amiuVar3.d |= 8;
                        break;
                    case 2:
                        aihf aihfVarD3 = xjl.d(aihfVar);
                        aihfVarD3.copyOnWrite();
                        amiw amiwVar7 = (amiw) aihfVarD3.instance;
                        amiw amiwVar8 = amiw.a;
                        amiwVar7.b |= SemanticState.ReadOnly;
                        amiwVar7.j = str.equals("1");
                        amiw amiwVar9 = (amiw) aihfVarD3.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVar.instance;
                        amiu amiuVar6 = amiu.a;
                        amiwVar9.getClass();
                        amiuVar5.N = amiwVar9;
                        amiuVar5.d |= 8;
                        break;
                    case 3:
                        aihf aihfVarD4 = xjl.d(aihfVar);
                        aihfVarD4.copyOnWrite();
                        amiw amiwVar10 = (amiw) aihfVarD4.instance;
                        amiw amiwVar11 = amiw.a;
                        amiwVar10.b |= SemanticState.Obscured;
                        amiwVar10.l = str.equals("1");
                        amiw amiwVar12 = (amiw) aihfVarD4.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar7 = (amiu) aihfVar.instance;
                        amiu amiuVar8 = amiu.a;
                        amiwVar12.getClass();
                        amiuVar7.N = amiwVar12;
                        amiuVar7.d |= 8;
                        break;
                    case 4:
                        aihf aihfVarD5 = xjl.d(aihfVar);
                        aihfVarD5.copyOnWrite();
                        amiw amiwVar13 = (amiw) aihfVarD5.instance;
                        amiw amiwVar14 = amiw.a;
                        amiwVar13.b |= SemanticState.LiveRegion;
                        amiwVar13.i = str;
                        amiw amiwVar15 = (amiw) aihfVarD5.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar9 = (amiu) aihfVar.instance;
                        amiu amiuVar10 = amiu.a;
                        amiwVar15.getClass();
                        amiuVar9.N = amiwVar15;
                        amiuVar9.d |= 8;
                        break;
                    case 5:
                        aihf aihfVarD6 = xjl.d(aihfVar);
                        Optional optionalA = xjl.a(str, new vmw(20), "PlaybackType");
                        aihfVarD6.getClass();
                        xdd xddVar2 = new xdd(aihfVarD6, 7);
                        if (true == optionalA.isPresent()) {
                            Object obj2 = optionalA.get();
                            aihf aihfVar3 = (aihf) xddVar2.a;
                            aihfVar3.copyOnWrite();
                            amiw amiwVar16 = (amiw) aihfVar3.instance;
                            amiw amiwVar17 = amiw.a;
                            amiwVar16.o = ((amjt) obj2).i;
                            amiwVar16.b |= 262144;
                        }
                        amiw amiwVar18 = (amiw) aihfVarD6.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar11 = (amiu) aihfVar.instance;
                        amiu amiuVar12 = amiu.a;
                        amiwVar18.getClass();
                        amiuVar11.N = amiwVar18;
                        amiuVar11.d |= 8;
                        break;
                    case 6:
                        xjm.h(str, aihfVar);
                        break;
                    case 7:
                        agkj agkjVar = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar13 = (amiu) aihfVar.instance;
                        amiu amiuVar14 = amiu.a;
                        amiuVar13.c |= 268435456;
                        amiuVar13.L = str.equals("1");
                        break;
                    case 8:
                        xjm.h(str, aihfVar);
                        break;
                    case 9:
                        aihf aihfVarD7 = xjl.d(aihfVar);
                        Optional optionalA2 = xjl.a(str, new xjh(1), "LatencyPlayerPreloadType");
                        aihfVarD7.getClass();
                        xdd xddVar3 = new xdd(aihfVarD7, 8);
                        if (true == optionalA2.isPresent()) {
                            Object obj3 = optionalA2.get();
                            aihf aihfVar4 = (aihf) xddVar3.a;
                            aihfVar4.copyOnWrite();
                            amiw amiwVar19 = (amiw) aihfVar4.instance;
                            amiw amiwVar20 = amiw.a;
                            amiwVar19.h = ((amjq) obj3).d;
                            amiwVar19.b |= SemanticState.Focused;
                        }
                        amiw amiwVar21 = (amiw) aihfVarD7.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar15 = (amiu) aihfVar.instance;
                        amiu amiuVar16 = amiu.a;
                        amiwVar21.getClass();
                        amiuVar15.N = amiwVar21;
                        amiuVar15.d |= 8;
                        break;
                    case 10:
                        aihf aihfVarD8 = xjl.d(aihfVar);
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 110) {
                            if (iHashCode2 != 112) {
                                if (iHashCode2 != 3107) {
                                    if (iHashCode2 != 3117) {
                                        if (iHashCode2 != 3119) {
                                            if (iHashCode2 != 3398) {
                                                if (iHashCode2 != 3646) {
                                                    if (iHashCode2 != 3650) {
                                                        if (iHashCode2 == 3681 ? str.equals("st") : !(iHashCode2 != 116079 || !str.equals("url"))) {
                                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                                                        }
                                                    } else if (str.equals("rt")) {
                                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                    }
                                                } else if (str.equals("rp")) {
                                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                                                }
                                            } else if (str.equals("jp")) {
                                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                                            }
                                        } else if (str.equals("ap")) {
                                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                        }
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    } else if (str.equals("an")) {
                                        amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                    } else {
                                        xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                        amjrVar = null;
                                    }
                                } else if (str.equals("ad")) {
                                    amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                                } else {
                                    xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                    amjrVar = null;
                                }
                            } else if (str.equals("p")) {
                                amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                            } else {
                                xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                                amjrVar = null;
                            }
                        } else if (str.equals("n")) {
                            amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        } else {
                            xjl.b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For LatencyPlayerSetOperationType = %s", str))), new Exception(), zvn.b);
                            amjrVar = null;
                        }
                        if (amjrVar != null) {
                            aihfVarD8.copyOnWrite();
                            amiw amiwVar22 = (amiw) aihfVarD8.instance;
                            amiw amiwVar23 = amiw.a;
                            amiwVar22.e = amjrVar.o;
                            amiwVar22.b |= 8;
                        }
                        amiw amiwVar24 = (amiw) aihfVarD8.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar17 = (amiu) aihfVar.instance;
                        amiu amiuVar18 = amiu.a;
                        amiwVar24.getClass();
                        amiuVar17.N = amiwVar24;
                        amiuVar17.d |= 8;
                        break;
                    case 11:
                        agkj agkjVar2 = xjl.a;
                        amjf amjfVar = ((amiu) aihfVar.instance).S;
                        if (amjfVar == null) {
                            amjfVar = amjf.a;
                        }
                        boolean zEquals = str.equals("1");
                        aihf builder = amjfVar.toBuilder();
                        builder.copyOnWrite();
                        amjf amjfVar2 = (amjf) builder.instance;
                        amjfVar2.b |= 64;
                        amjfVar2.i = zEquals;
                        amjf amjfVar3 = (amjf) builder.build();
                        aihfVar.copyOnWrite();
                        amiu amiuVar19 = (amiu) aihfVar.instance;
                        amjfVar3.getClass();
                        amiuVar19.S = amjfVar3;
                        amiuVar19.d |= 131072;
                        break;
                    case 12:
                        agkj agkjVar3 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar20 = (amiu) aihfVar.instance;
                        amiu amiuVar21 = amiu.a;
                        amiuVar20.c |= 64;
                        amiuVar20.B = str;
                        break;
                    case 13:
                        agkj agkjVar4 = xjl.a;
                        Optional optionalA3 = xjl.a(str, new rmm(16), "ClientConnectionType");
                        aihfVar.getClass();
                        hkp hkpVar = new hkp(aihfVar, 16);
                        if (true == optionalA3.isPresent()) {
                            Object obj4 = optionalA3.get();
                            aihf aihfVar5 = (aihf) hkpVar.a;
                            aihfVar5.copyOnWrite();
                            amiu amiuVar22 = (amiu) aihfVar5.instance;
                            amiu amiuVar23 = amiu.a;
                            amiuVar22.l = ((ajuf) obj4).p;
                            amiuVar22.b |= SemanticState.Modal;
                        }
                        break;
                    case 14:
                        agkj agkjVar5 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar24 = (amiu) aihfVar.instance;
                        amiu amiuVar25 = amiu.a;
                        amiuVar24.b |= 32768;
                        amiuVar24.n = str;
                        break;
                    case 15:
                        agkj agkjVar6 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar26 = (amiu) aihfVar.instance;
                        amiu amiuVar27 = amiu.a;
                        amiuVar26.c |= 16384;
                        amiuVar26.H = str;
                        break;
                    case 16:
                        agkj agkjVar7 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar28 = (amiu) aihfVar.instance;
                        amiu amiuVar29 = amiu.a;
                        amiuVar28.b |= 16;
                        amiuVar28.h = str;
                        break;
                    case 17:
                        agkj agkjVar8 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar30 = (amiu) aihfVar.instance;
                        amiu amiuVar31 = amiu.a;
                        amiuVar30.c |= 134217728;
                        amiuVar30.K = str.equals("1");
                        break;
                    case 18:
                        int iC = xjl.c(str, true);
                        int i110 = iC != 0 ? iC : 1;
                        aihfVar.copyOnWrite();
                        amiu amiuVar32 = (amiu) aihfVar.instance;
                        amiu amiuVar33 = amiu.a;
                        amiuVar32.f = i110 - 1;
                        amiuVar32.b |= 4;
                        break;
                    case 19:
                        agkj agkjVar9 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar34 = (amiu) aihfVar.instance;
                        amiu amiuVar35 = amiu.a;
                        amiuVar34.b |= 536870912;
                        amiuVar34.w = str;
                        break;
                    default:
                        agkj agkjVar10 = xjl.a;
                        aihfVar.copyOnWrite();
                        amiu amiuVar36 = (amiu) aihfVar.instance;
                        amiu amiuVar37 = amiu.a;
                        amiuVar36.c |= 2;
                        amiuVar36.A = str.equals("1");
                        break;
                }
            }
        });
        agkhVar3.e("GetBrowse_rid", new xjk("GetBrowse"));
        agkhVar3.e("GetHome_rid", new xjk("GetHome"));
        agkhVar3.e("GetLibrary_rid", new xjk("GetLibrary"));
        agkhVar3.e("GetMusicSearchResults_rid", new xjk("GetMusicSearchResults"));
        agkhVar3.e("GetPlayer_rid", new xjk("GetPlayer"));
        agkhVar3.e("GetWatch_rid", new xjk("GetWatch"));
        agkhVar3.e("GetSearch_rid", new xjk("GetSearch"));
        agkhVar3.e("GetSettings_rid", new xjk("GetSettings"));
        agkhVar3.e("GetTrending_rid", new xjk("GetTrending"));
        agkhVar3.e("GetReelItemWatch_rid", new xjk("GetReelItemWatch"));
        agkhVar3.e("GetWatchNext_rid", new xjk("GetWatchNext"));
        agkhVar3.e("Handoff_rid", new xjk("Handoff"));
        agkhVar3.e("GetWatchPage_rid", new xjk("GetWatchPage"));
        agkhVar3.e("GetAttestationChallenge_rid", new xjk("GetAttestationChallenge"));
        agkhVar3.e("GetAdBreak_rid", new xjk("GetAdBreak"));
        agkhVar3.e("GetMobileMainAppGuide_rid", new xjk("GetMobileMainAppGuide"));
        agkhVar3.e("GetReelWatchSequence_rid", new xjk("GetReelWatchSequence"));
        agkhVar3.e("SetNotificationRegistration_rid", new xjk("SetNotificationRegistration"));
        agkhVar3.e("RecordNotificationInteractions_rid", new xjk("RecordNotificationInteractions"));
        agkhVar3.e("GetChannelPage_rid", new xjk("GetChannelPage"));
        agkhVar3.e("OfflineRefresh_rid", new xjk("OfflineRefresh"));
        agkhVar3.e("GetHistoryPausedState_rid", new xjk("GetHistoryPausedState"));
        agkhVar3.e("Like_rid", new xjk("Like"));
        agkhVar3.e("HandlePromoFeedback_rid", new xjk("HandlePromoFeedback"));
        agkhVar3.e("GetSubscriptions_rid", new xjk("GetSubscriptions"));
        agkhVar3.e("GetUpdatedMetadata_rid", new xjk("GetUpdatedMetadata"));
        agkhVar3.e("Heartbeat_rid", new xjk("Heartbeat"));
        c = agkhVar3.d(true);
    }

    public static Optional a(String str, Function function, String str2) {
        aihr aihrVar = (aihr) function.apply(Integer.valueOf(Integer.parseInt(str)));
        if (aihrVar == null) {
            b("Csi-on-Gel: Unrecognize enum type ".concat(String.valueOf(String.format("For type %s, value = %s", str2, str))), new Exception(), zvn.a);
        }
        return Optional.ofNullable(aihrVar);
    }

    static void b(String str, Throwable th, zvn zvnVar) {
        zvp.d(zvnVar, zvm.m, str, th, Optional.empty(), new rmm(17));
    }

    static int c(String str, boolean z) {
        Integer num = (Integer) a.get(str);
        int iK = num == null ? 0 : atqp.K(num.intValue());
        if (!z || iK != 0) {
            return iK;
        }
        Integer num2 = (Integer) b.get(str);
        if (num2 != null) {
            return atqp.K(num2.intValue());
        }
        return 0;
    }

    public static aihf d(aihf aihfVar) {
        amiw amiwVar = ((amiu) aihfVar.instance).N;
        if (amiwVar == null) {
            amiwVar = amiw.a;
        }
        return amiwVar.toBuilder();
    }

    public static aihf e(aihf aihfVar) {
        amjl amjlVar = ((amiu) aihfVar.instance).Q;
        if (amjlVar == null) {
            amjlVar = amjl.a;
        }
        return amjlVar.toBuilder();
    }
}
