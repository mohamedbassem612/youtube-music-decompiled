package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wgd {
    public final apoq a;
    private agke b = null;
    private agke c = null;

    public wgd(apoq apoqVar) {
        apoqVar.getClass();
        this.a = apoqVar;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:972:0x0957  */
    public static Optional c(apox apoxVar) {
        Object obj;
        MessageLite messageLite;
        int i = apoxVar.b;
        int i2 = i & 32;
        if (i2 != 0) {
            amgg amggVar = apoxVar.m;
            if (amggVar == null) {
                amggVar = amgg.a;
            }
            return Optional.of(new wga(amggVar));
        }
        int i3 = i & 16777216;
        if (i3 != 0) {
            apun apunVar = apoxVar.F;
            if (apunVar == null) {
                apunVar = apun.a;
            }
            apup apupVar = apunVar.l;
            if (apupVar == null) {
                apupVar = apup.a;
            }
            if ((apupVar.b & 8) != 0) {
                return Optional.of(new wgh(apunVar));
            }
            apup apupVar2 = apunVar.l;
            if (((apupVar2 == null ? apup.a : apupVar2).b & 4) != 0) {
                return Optional.of(new wfz(apunVar));
            }
            if ((apunVar.b & 16777216) != 0) {
                if (apupVar2 == null) {
                    apupVar2 = apup.a;
                }
                if (apupVar2 != null) {
                    int i4 = apupVar2.b;
                    if ((i4 & 1) != 0) {
                        messageLite = apupVar2.c;
                        if (messageLite == null) {
                            messageLite = alde.a;
                        }
                    } else if ((i4 & 2) != 0) {
                        messageLite = apupVar2.d;
                        if (messageLite == null) {
                            messageLite = alfr.a;
                        }
                    } else if ((i4 & 4) != 0) {
                        messageLite = apupVar2.e;
                        if (messageLite == null) {
                            messageLite = alig.a;
                        }
                    } else if ((i4 & 8) != 0) {
                        messageLite = apupVar2.f;
                        if (messageLite == null) {
                            messageLite = arca.a;
                        }
                    } else if ((i4 & 16) != 0) {
                        messageLite = apupVar2.g;
                        if (messageLite == null) {
                            messageLite = apud.a;
                        }
                    } else if ((i4 & 32) != 0) {
                        messageLite = apupVar2.h;
                        if (messageLite == null) {
                            messageLite = alii.a;
                        }
                    } else if ((i4 & 64) != 0) {
                        messageLite = apupVar2.i;
                        if (messageLite == null) {
                            messageLite = angn.a;
                        }
                    } else if ((i4 & SemanticState.Focused) != 0) {
                        messageLite = apupVar2.j;
                        if (messageLite == null) {
                            messageLite = aqwa.a;
                        }
                    } else if ((i4 & SemanticState.Hidden) != 0) {
                        messageLite = apupVar2.k;
                        if (messageLite == null) {
                            messageLite = aqyd.a;
                        }
                    } else if ((i4 & SemanticState.LiveRegion) != 0) {
                        messageLite = apupVar2.l;
                        if (messageLite == null) {
                            messageLite = akvt.a;
                        }
                    } else {
                        messageLite = null;
                    }
                } else {
                    messageLite = null;
                }
                if (messageLite != null) {
                    return Optional.of(apunVar);
                }
            }
        } else {
            if (apoxVar == null) {
                obj = null;
            } else if ((i & 1) != 0) {
                obj = apoxVar.h;
                if (obj == null) {
                    obj = arex.a;
                }
            } else if ((i & 2) != 0) {
                obj = apoxVar.i;
                if (obj == null) {
                    obj = arfk.a;
                }
            } else if ((i & 4) != 0) {
                obj = apoxVar.j;
                if (obj == null) {
                    obj = akcv.a;
                }
            } else if ((i & 8) != 0) {
                obj = apoxVar.k;
                if (obj == null) {
                    obj = ajnf.a;
                }
            } else if ((i & 16) != 0) {
                obj = apoxVar.l;
                if (obj == null) {
                    obj = akxa.a;
                }
            } else if (i2 != 0) {
                obj = apoxVar.m;
                if (obj == null) {
                    obj = amgg.a;
                }
            } else if ((i & 64) != 0) {
                obj = apoxVar.n;
                if (obj == null) {
                    obj = ajak.a;
                }
            } else if ((i & SemanticState.Focused) != 0) {
                obj = apoxVar.o;
                if (obj == null) {
                    obj = amgb.a;
                }
            } else if ((i & SemanticState.Hidden) != 0) {
                obj = apoxVar.p;
                if (obj == null) {
                    obj = alfr.a;
                }
            } else if ((i & SemanticState.LiveRegion) != 0) {
                obj = apoxVar.q;
                if (obj == null) {
                    obj = ajyw.a;
                }
            } else if ((i & SemanticState.ReadOnly) != 0) {
                obj = apoxVar.r;
                if (obj == null) {
                    obj = amtp.a;
                }
            } else if ((i & SemanticState.Modal) != 0) {
                obj = apoxVar.s;
                if (obj == null) {
                    obj = anrg.a;
                }
            } else if ((i & SemanticState.Obscured) != 0) {
                obj = apoxVar.t;
                if (obj == null) {
                    obj = anjl.a;
                }
            } else if ((i & SemanticState.Multiline) != 0) {
                obj = apoxVar.u;
                if (obj == null) {
                    obj = akva.a;
                }
            } else if ((i & 16384) != 0) {
                obj = apoxVar.v;
                if (obj == null) {
                    obj = ajvn.a;
                }
            } else if ((i & 32768) != 0) {
                obj = apoxVar.w;
                if (obj == null) {
                    obj = ajza.a;
                }
            } else if ((i & 65536) != 0) {
                obj = apoxVar.x;
                if (obj == null) {
                    obj = ajzs.a;
                }
            } else if ((i & 131072) != 0) {
                obj = apoxVar.y;
                if (obj == null) {
                    obj = ajzi.a;
                }
            } else if ((i & 262144) != 0) {
                obj = apoxVar.z;
                if (obj == null) {
                    obj = akcj.a;
                }
            } else if ((i & 524288) != 0) {
                obj = apoxVar.A;
                if (obj == null) {
                    obj = aovx.a;
                }
            } else if ((i & 1048576) != 0) {
                obj = apoxVar.B;
                if (obj == null) {
                    obj = apjq.a;
                }
            } else if ((2097152 & i) != 0) {
                obj = apoxVar.C;
                if (obj == null) {
                    obj = aozc.a;
                }
            } else if ((4194304 & i) != 0) {
                obj = apoxVar.D;
                if (obj == null) {
                    obj = apol.a;
                }
            } else if ((8388608 & i) != 0) {
                obj = apoxVar.E;
                if (obj == null) {
                    obj = apui.a;
                }
            } else if (i3 != 0) {
                obj = apoxVar.F;
                if (obj == null) {
                    obj = apun.a;
                }
            } else if ((33554432 & i) != 0) {
                obj = apoxVar.G;
                if (obj == null) {
                    obj = akmu.a;
                }
            } else if ((67108864 & i) != 0) {
                obj = apoxVar.H;
                if (obj == null) {
                    obj = apua.a;
                }
            } else if ((134217728 & i) != 0) {
                obj = apoxVar.I;
                if (obj == null) {
                    obj = aqhe.a;
                }
            } else if ((268435456 & i) != 0) {
                obj = apoxVar.J;
                if (obj == null) {
                    obj = aqhg.a;
                }
            } else if ((536870912 & i) != 0) {
                obj = apoxVar.K;
                if (obj == null) {
                    obj = aqhb.a;
                }
            } else if ((1073741824 & i) != 0) {
                obj = apoxVar.L;
                if (obj == null) {
                    obj = aqha.a;
                }
            } else if ((i & Integer.MIN_VALUE) != 0) {
                obj = apoxVar.M;
                if (obj == null) {
                    obj = ajez.a;
                }
            } else {
                int i5 = apoxVar.c;
                if ((i5 & 1) != 0) {
                    obj = apoxVar.N;
                    if (obj == null) {
                        obj = arip.a;
                    }
                } else if ((i5 & 2) != 0) {
                    obj = apoxVar.O;
                    if (obj == null) {
                        obj = aoex.a;
                    }
                } else if ((i5 & 4) != 0) {
                    obj = apoxVar.P;
                    if (obj == null) {
                        obj = aofz.a;
                    }
                } else if ((i5 & 8) != 0) {
                    obj = apoxVar.Q;
                    if (obj == null) {
                        obj = aomm.a;
                    }
                } else if ((i5 & 16) != 0) {
                    obj = apoxVar.R;
                    if (obj == null) {
                        obj = airg.a;
                    }
                } else if ((i5 & 32) != 0) {
                    obj = apoxVar.S;
                    if (obj == null) {
                        obj = angy.a;
                    }
                } else if ((i5 & 64) != 0) {
                    obj = apoxVar.T;
                    if (obj == null) {
                        obj = ajaz.a;
                    }
                } else if ((i5 & SemanticState.Focused) != 0) {
                    obj = apoxVar.U;
                    if (obj == null) {
                        obj = ajas.a;
                    }
                } else if ((i5 & SemanticState.Hidden) != 0) {
                    obj = apoxVar.V;
                    if (obj == null) {
                        obj = akjp.a;
                    }
                } else if ((i5 & SemanticState.LiveRegion) != 0) {
                    obj = apoxVar.W;
                    if (obj == null) {
                        obj = aiwq.a;
                    }
                } else if ((i5 & SemanticState.ReadOnly) != 0) {
                    obj = apoxVar.X;
                    if (obj == null) {
                        obj = akev.a;
                    }
                } else if ((i5 & SemanticState.Modal) != 0) {
                    obj = apoxVar.Y;
                    if (obj == null) {
                        obj = akfm.a;
                    }
                } else if ((i5 & SemanticState.Obscured) != 0) {
                    obj = apoxVar.Z;
                    if (obj == null) {
                        obj = aomx.a;
                    }
                } else if ((i5 & SemanticState.Multiline) != 0) {
                    obj = apoxVar.aa;
                    if (obj == null) {
                        obj = aiwp.a;
                    }
                } else if ((i5 & 16384) != 0) {
                    obj = apoxVar.ab;
                    if (obj == null) {
                        obj = ankg.a;
                    }
                } else if ((i5 & 32768) != 0) {
                    obj = apoxVar.ac;
                    if (obj == null) {
                        obj = amrv.a;
                    }
                } else if ((i5 & 65536) != 0) {
                    obj = apoxVar.ad;
                    if (obj == null) {
                        obj = amrs.a;
                    }
                } else if ((i5 & 131072) != 0) {
                    obj = apoxVar.ae;
                    if (obj == null) {
                        obj = amry.a;
                    }
                } else if ((i5 & 262144) != 0) {
                    obj = apoxVar.af;
                    if (obj == null) {
                        obj = ammg.a;
                    }
                } else if ((i5 & 524288) != 0) {
                    obj = apoxVar.ag;
                    if (obj == null) {
                        obj = amrr.a;
                    }
                } else if ((i5 & 1048576) != 0) {
                    obj = apoxVar.ah;
                    if (obj == null) {
                        obj = amrw.a;
                    }
                } else if ((2097152 & i5) != 0) {
                    obj = apoxVar.ai;
                    if (obj == null) {
                        obj = amrz.a;
                    }
                } else if ((4194304 & i5) != 0) {
                    obj = apoxVar.aj;
                    if (obj == null) {
                        obj = alig.a;
                    }
                } else if ((8388608 & i5) != 0) {
                    obj = apoxVar.ak;
                    if (obj == null) {
                        obj = aqtq.a;
                    }
                } else if ((i5 & 16777216) != 0) {
                    obj = apoxVar.al;
                    if (obj == null) {
                        obj = aogr.a;
                    }
                } else if ((33554432 & i5) != 0) {
                    obj = apoxVar.am;
                    if (obj == null) {
                        obj = ajqy.a;
                    }
                } else if ((67108864 & i5) != 0) {
                    obj = apoxVar.an;
                    if (obj == null) {
                        obj = anlj.a;
                    }
                } else if ((134217728 & i5) != 0) {
                    obj = apoxVar.ao;
                    if (obj == null) {
                        obj = anmk.a;
                    }
                } else if ((268435456 & i5) != 0) {
                    obj = apoxVar.ap;
                    if (obj == null) {
                        obj = antf.a;
                    }
                } else if ((536870912 & i5) != 0) {
                    obj = apoxVar.aq;
                    if (obj == null) {
                        obj = anwt.a;
                    }
                } else if ((1073741824 & i5) != 0) {
                    obj = apoxVar.ar;
                    if (obj == null) {
                        obj = anwi.a;
                    }
                } else if ((i5 & Integer.MIN_VALUE) != 0) {
                    obj = apoxVar.as;
                    if (obj == null) {
                        obj = anxe.a;
                    }
                } else {
                    int i6 = apoxVar.d;
                    if ((i6 & 1) != 0) {
                        obj = apoxVar.at;
                        if (obj == null) {
                            obj = anss.a;
                        }
                    } else if ((i6 & 2) != 0) {
                        obj = apoxVar.au;
                        if (obj == null) {
                            obj = anyb.a;
                        }
                    } else if ((i6 & 4) != 0) {
                        obj = apoxVar.av;
                        if (obj == null) {
                            obj = anrt.a;
                        }
                    } else if ((i6 & 8) != 0) {
                        obj = apoxVar.aw;
                        if (obj == null) {
                            obj = anoh.a;
                        }
                    } else if ((i6 & 16) != 0) {
                        obj = apoxVar.ax;
                        if (obj == null) {
                            obj = anlm.a;
                        }
                    } else if ((i6 & 32) != 0) {
                        obj = apoxVar.ay;
                        if (obj == null) {
                            obj = anpq.a;
                        }
                    } else if ((i6 & 64) != 0) {
                        obj = apoxVar.az;
                        if (obj == null) {
                            obj = anwm.a;
                        }
                    } else if ((i6 & SemanticState.Focused) != 0) {
                        obj = apoxVar.aA;
                        if (obj == null) {
                            obj = annb.a;
                        }
                    } else if ((i6 & SemanticState.Hidden) != 0) {
                        obj = apoxVar.aB;
                        if (obj == null) {
                            obj = anxs.a;
                        }
                    } else if ((i6 & SemanticState.LiveRegion) != 0) {
                        obj = apoxVar.aC;
                        if (obj == null) {
                            obj = anwa.a;
                        }
                    } else if ((i6 & SemanticState.ReadOnly) != 0) {
                        obj = apoxVar.aD;
                        if (obj == null) {
                            obj = annx.a;
                        }
                    } else if ((i6 & SemanticState.Modal) != 0) {
                        obj = apoxVar.aE;
                        if (obj == null) {
                            obj = anvy.a;
                        }
                    } else if ((i6 & SemanticState.Obscured) != 0) {
                        obj = apoxVar.aF;
                        if (obj == null) {
                            obj = anpe.a;
                        }
                    } else if ((i6 & SemanticState.Multiline) != 0) {
                        obj = apoxVar.aG;
                        if (obj == null) {
                            obj = akfy.a;
                        }
                    } else if ((i6 & 16384) != 0) {
                        obj = apoxVar.aH;
                        if (obj == null) {
                            obj = ajta.a;
                        }
                    } else if ((i6 & 32768) != 0) {
                        obj = apoxVar.aI;
                        if (obj == null) {
                            obj = aqtv.a;
                        }
                    } else if ((i6 & 65536) != 0) {
                        obj = apoxVar.aJ;
                        if (obj == null) {
                            obj = aqtx.a;
                        }
                    } else if ((i6 & 131072) != 0) {
                        obj = apoxVar.aK;
                        if (obj == null) {
                            obj = aqvx.a;
                        }
                    } else if ((i6 & 262144) != 0) {
                        obj = apoxVar.aL;
                        if (obj == null) {
                            obj = aqvz.a;
                        }
                    } else if ((i6 & 524288) != 0) {
                        obj = apoxVar.aM;
                        if (obj == null) {
                            obj = aqwg.a;
                        }
                    } else if ((i6 & 1048576) != 0) {
                        obj = apoxVar.aN;
                        if (obj == null) {
                            obj = aqyo.a;
                        }
                    } else if ((2097152 & i6) != 0) {
                        obj = apoxVar.aO;
                        if (obj == null) {
                            obj = aqyp.a;
                        }
                    } else if ((4194304 & i6) != 0) {
                        obj = apoxVar.aP;
                        if (obj == null) {
                            obj = aqyq.a;
                        }
                    } else if ((8388608 & i6) != 0) {
                        obj = apoxVar.aQ;
                        if (obj == null) {
                            obj = aqyd.a;
                        }
                    } else if ((i6 & 16777216) != 0) {
                        obj = apoxVar.aR;
                        if (obj == null) {
                            obj = aquz.a;
                        }
                    } else if ((33554432 & i6) != 0) {
                        obj = apoxVar.aS;
                        if (obj == null) {
                            obj = aqvg.a;
                        }
                    } else if ((67108864 & i6) != 0) {
                        obj = apoxVar.aT;
                        if (obj == null) {
                            obj = aqvl.a;
                        }
                    } else if ((134217728 & i6) != 0) {
                        obj = apoxVar.aU;
                        if (obj == null) {
                            obj = aqvq.a;
                        }
                    } else if ((268435456 & i6) != 0) {
                        obj = apoxVar.aV;
                        if (obj == null) {
                            obj = aqyj.a;
                        }
                    } else if ((536870912 & i6) != 0) {
                        obj = apoxVar.aW;
                        if (obj == null) {
                            obj = aquv.a;
                        }
                    } else if ((1073741824 & i6) != 0) {
                        obj = apoxVar.aX;
                        if (obj == null) {
                            obj = aquu.a;
                        }
                    } else if ((i6 & Integer.MIN_VALUE) != 0) {
                        obj = apoxVar.aY;
                        if (obj == null) {
                            obj = aqya.a;
                        }
                    } else {
                        int i7 = apoxVar.e;
                        if ((i7 & 1) != 0) {
                            obj = apoxVar.aZ;
                            if (obj == null) {
                                obj = aqxp.a;
                            }
                        } else if ((i7 & 2) != 0) {
                            obj = apoxVar.ba;
                            if (obj == null) {
                                obj = aquq.a;
                            }
                        } else if ((i7 & 4) != 0) {
                            obj = apoxVar.bb;
                            if (obj == null) {
                                obj = ajmd.a;
                            }
                        } else if ((i7 & 8) != 0) {
                            obj = apoxVar.bc;
                            if (obj == null) {
                                obj = angn.a;
                            }
                        } else if ((i7 & 16) != 0) {
                            obj = apoxVar.bd;
                            if (obj == null) {
                                obj = aouj.a;
                            }
                        } else if ((i7 & 32) != 0) {
                            obj = apoxVar.be;
                            if (obj == null) {
                                obj = apkd.a;
                            }
                        } else if ((i7 & 64) != 0) {
                            obj = apoxVar.bf;
                            if (obj == null) {
                                obj = alce.a;
                            }
                        } else if ((i7 & SemanticState.Focused) != 0) {
                            obj = apoxVar.bg;
                            if (obj == null) {
                                obj = albs.a;
                            }
                        } else if ((i7 & SemanticState.Hidden) != 0) {
                            obj = apoxVar.bh;
                            if (obj == null) {
                                obj = alcd.a;
                            }
                        } else if ((i7 & SemanticState.LiveRegion) != 0) {
                            obj = apoxVar.bi;
                            if (obj == null) {
                                obj = albz.a;
                            }
                        } else if ((i7 & SemanticState.ReadOnly) != 0) {
                            obj = apoxVar.bj;
                            if (obj == null) {
                                obj = ajpq.a;
                            }
                        } else if ((i7 & SemanticState.Modal) != 0) {
                            obj = apoxVar.bk;
                            if (obj == null) {
                                obj = apce.a;
                            }
                        } else if ((i7 & SemanticState.Obscured) != 0) {
                            obj = apoxVar.bl;
                            if (obj == null) {
                                obj = aoak.a;
                            }
                        } else if ((i7 & SemanticState.Multiline) != 0) {
                            obj = apoxVar.bm;
                            if (obj == null) {
                                obj = arht.a;
                            }
                        } else if ((i7 & 16384) != 0) {
                            obj = apoxVar.bn;
                            if (obj == null) {
                                obj = aqmo.a;
                            }
                        } else if ((i7 & 32768) != 0) {
                            obj = apoxVar.bo;
                            if (obj == null) {
                                obj = angk.a;
                            }
                        } else if ((i7 & 65536) != 0) {
                            obj = apoxVar.bp;
                            if (obj == null) {
                                obj = ajuy.a;
                            }
                        } else if ((i7 & 131072) != 0) {
                            obj = apoxVar.bq;
                            if (obj == null) {
                                obj = akdl.a;
                            }
                        } else if ((i7 & 262144) != 0) {
                            obj = apoxVar.br;
                            if (obj == null) {
                                obj = anuz.a;
                            }
                        } else if ((i7 & 524288) != 0) {
                            obj = apoxVar.bs;
                            if (obj == null) {
                                obj = apke.a;
                            }
                        } else if ((i7 & 1048576) != 0) {
                            obj = apoxVar.bt;
                            if (obj == null) {
                                obj = aokw.a;
                            }
                        } else if ((2097152 & i7) != 0) {
                            obj = apoxVar.bu;
                            if (obj == null) {
                                obj = akmq.a;
                            }
                        } else if ((4194304 & i7) != 0) {
                            obj = apoxVar.bv;
                            if (obj == null) {
                                obj = aqca.a;
                            }
                        } else if ((8388608 & i7) != 0) {
                            obj = apoxVar.bw;
                            if (obj == null) {
                                obj = aqbt.a;
                            }
                        } else if ((i7 & 16777216) != 0) {
                            obj = apoxVar.bx;
                            if (obj == null) {
                                obj = aqbl.a;
                            }
                        } else if ((33554432 & i7) != 0) {
                            obj = apoxVar.by;
                            if (obj == null) {
                                obj = aqbn.a;
                            }
                        } else if ((67108864 & i7) != 0) {
                            obj = apoxVar.bz;
                            if (obj == null) {
                                obj = apqt.a;
                            }
                        } else if ((134217728 & i7) != 0) {
                            obj = apoxVar.bA;
                            if (obj == null) {
                                obj = akcl.a;
                            }
                        } else if ((268435456 & i7) != 0) {
                            obj = apoxVar.bB;
                            if (obj == null) {
                                obj = aqqe.a;
                            }
                        } else if ((536870912 & i7) != 0) {
                            obj = apoxVar.bC;
                            if (obj == null) {
                                obj = aivt.a;
                            }
                        } else if ((1073741824 & i7) != 0) {
                            obj = apoxVar.bD;
                            if (obj == null) {
                                obj = anmx.a;
                            }
                        } else if ((i7 & Integer.MIN_VALUE) != 0) {
                            obj = apoxVar.bE;
                            if (obj == null) {
                                obj = akms.a;
                            }
                        } else {
                            int i8 = apoxVar.f;
                            if ((i8 & 1) != 0) {
                                obj = apoxVar.bF;
                                if (obj == null) {
                                    obj = aqam.a;
                                }
                            } else if ((i8 & 2) != 0) {
                                obj = apoxVar.bG;
                                if (obj == null) {
                                    obj = arhj.a;
                                }
                            } else if ((i8 & 4) != 0) {
                                obj = apoxVar.bH;
                                if (obj == null) {
                                    obj = aled.a;
                                }
                            } else if ((i8 & 8) != 0) {
                                obj = apoxVar.bI;
                                if (obj == null) {
                                    obj = akxh.a;
                                }
                            } else if ((i8 & 16) != 0) {
                                obj = apoxVar.bJ;
                                if (obj == null) {
                                    obj = ajrg.a;
                                }
                            } else if ((i8 & 32) != 0) {
                                obj = apoxVar.bK;
                                if (obj == null) {
                                    obj = aolp.a;
                                }
                            } else if ((i8 & 64) != 0) {
                                obj = apoxVar.bL;
                                if (obj == null) {
                                    obj = aolr.a;
                                }
                            } else if ((i8 & SemanticState.Focused) != 0) {
                                obj = apoxVar.bM;
                                if (obj == null) {
                                    obj = akei.a;
                                }
                            } else if ((i8 & SemanticState.Hidden) != 0) {
                                obj = apoxVar.bN;
                                if (obj == null) {
                                    obj = ajan.a;
                                }
                            } else if ((i8 & SemanticState.LiveRegion) != 0) {
                                obj = apoxVar.bO;
                                if (obj == null) {
                                    obj = aozo.a;
                                }
                            } else if ((i8 & SemanticState.ReadOnly) != 0) {
                                obj = apoxVar.bP;
                                if (obj == null) {
                                    obj = aqco.a;
                                }
                            } else if ((i8 & SemanticState.Modal) != 0) {
                                obj = apoxVar.bQ;
                                if (obj == null) {
                                    obj = akyl.a;
                                }
                            } else if ((i8 & SemanticState.Obscured) != 0) {
                                obj = apoxVar.bR;
                                if (obj == null) {
                                    obj = akqz.a;
                                }
                            } else if ((i8 & SemanticState.Multiline) != 0) {
                                obj = apoxVar.bS;
                                if (obj == null) {
                                    obj = amkn.a;
                                }
                            } else if ((i8 & 16384) != 0) {
                                obj = apoxVar.bT;
                                if (obj == null) {
                                    obj = anto.a;
                                }
                            } else if ((i8 & 32768) != 0) {
                                obj = apoxVar.bU;
                                if (obj == null) {
                                    obj = aljh.a;
                                }
                            } else if ((i8 & 65536) != 0) {
                                obj = apoxVar.bV;
                                if (obj == null) {
                                    obj = akao.a;
                                }
                            } else if ((131072 & i8) != 0) {
                                obj = apoxVar.bW;
                                if (obj == null) {
                                    obj = anij.a;
                                }
                            } else if ((262144 & i8) != 0) {
                                obj = apoxVar.bX;
                                if (obj == null) {
                                    obj = anik.a;
                                }
                            } else if ((524288 & i8) != 0) {
                                obj = apoxVar.bY;
                                if (obj == null) {
                                    obj = akzv.a;
                                }
                            } else if ((1048576 & i8) != 0) {
                                obj = apoxVar.bZ;
                                if (obj == null) {
                                    obj = alhd.a;
                                }
                            } else if ((2097152 & i8) != 0) {
                                obj = apoxVar.ca;
                                if (obj == null) {
                                    obj = aoyn.a;
                                }
                            } else if ((4194304 & i8) != 0) {
                                obj = apoxVar.cb;
                                if (obj == null) {
                                    obj = arqn.a;
                                }
                            } else if ((8388608 & i8) != 0) {
                                obj = apoxVar.cc;
                                if (obj == null) {
                                    obj = ajrw.a;
                                }
                            } else if ((16777216 & i8) != 0) {
                                obj = apoxVar.cd;
                                if (obj == null) {
                                    obj = aqaw.a;
                                }
                            } else if ((33554432 & i8) != 0) {
                                obj = apoxVar.ce;
                                if (obj == null) {
                                    obj = apmz.a;
                                }
                            } else if ((67108864 & i8) != 0) {
                                obj = apoxVar.cf;
                                if (obj == null) {
                                    obj = anhg.a;
                                }
                            } else if ((134217728 & i8) != 0) {
                                obj = apoxVar.cg;
                                if (obj == null) {
                                    obj = anhi.a;
                                }
                            } else if ((268435456 & i8) != 0) {
                                obj = apoxVar.ch;
                                if (obj == null) {
                                    obj = anhj.a;
                                }
                            } else if ((536870912 & i8) != 0) {
                                obj = apoxVar.ci;
                                if (obj == null) {
                                    obj = anhs.a;
                                }
                            } else if ((1073741824 & i8) != 0) {
                                obj = apoxVar.cj;
                                if (obj == null) {
                                    obj = aojx.a;
                                }
                            } else if ((i8 & Integer.MIN_VALUE) != 0) {
                                obj = apoxVar.ck;
                                if (obj == null) {
                                    obj = akfs.a;
                                }
                            } else {
                                int i9 = apoxVar.g;
                                if ((i9 & 1) != 0) {
                                    obj = apoxVar.cl;
                                    if (obj == null) {
                                        obj = akws.a;
                                    }
                                } else if ((i9 & 2) != 0) {
                                    obj = apoxVar.cm;
                                    if (obj == null) {
                                        obj = anhx.a;
                                    }
                                } else if ((i9 & 4) != 0) {
                                    obj = apoxVar.cn;
                                    if (obj == null) {
                                        obj = amqe.a;
                                    }
                                } else if ((i9 & 8) != 0) {
                                    obj = apoxVar.co;
                                    if (obj == null) {
                                        obj = amor.a;
                                    }
                                } else if ((i9 & 16) != 0) {
                                    obj = apoxVar.cp;
                                    if (obj == null) {
                                        obj = amnq.a;
                                    }
                                } else if ((i9 & 32) != 0) {
                                    obj = apoxVar.cq;
                                    if (obj == null) {
                                        obj = amob.a;
                                    }
                                } else if ((i9 & 64) != 0) {
                                    obj = apoxVar.cr;
                                    if (obj == null) {
                                        obj = amln.a;
                                    }
                                } else if ((i9 & SemanticState.Focused) != 0) {
                                    obj = apoxVar.cs;
                                    if (obj == null) {
                                        obj = akej.a;
                                    }
                                } else if ((i9 & SemanticState.Hidden) != 0) {
                                    obj = apoxVar.ct;
                                    if (obj == null) {
                                        obj = aoxw.a;
                                    }
                                } else if ((i9 & SemanticState.LiveRegion) != 0) {
                                    obj = apoxVar.cu;
                                    if (obj == null) {
                                        obj = amhg.a;
                                    }
                                } else if ((i9 & SemanticState.ReadOnly) != 0) {
                                    obj = apoxVar.cv;
                                    if (obj == null) {
                                        obj = ajvm.a;
                                    }
                                } else if ((i9 & SemanticState.Modal) != 0) {
                                    obj = apoxVar.cw;
                                    if (obj == null) {
                                        obj = akti.a;
                                    }
                                } else if ((i9 & SemanticState.Obscured) != 0) {
                                    obj = apoxVar.cx;
                                    if (obj == null) {
                                        obj = aktm.a;
                                    }
                                } else if ((i9 & SemanticState.Multiline) != 0) {
                                    obj = apoxVar.cy;
                                    if (obj == null) {
                                        obj = akhx.a;
                                    }
                                } else if ((i9 & 16384) != 0) {
                                    obj = apoxVar.cz;
                                    if (obj == null) {
                                        obj = akxl.a;
                                    }
                                } else if ((32768 & i9) != 0) {
                                    obj = apoxVar.cA;
                                    if (obj == null) {
                                        obj = aocp.a;
                                    }
                                } else if ((i9 & 65536) != 0) {
                                    obj = apoxVar.cB;
                                    if (obj == null) {
                                        obj = akgd.a;
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                        }
                    }
                }
            }
            if (obj != null) {
                return Optional.of(obj);
            }
        }
        return Optional.empty();
    }

    public final synchronized agke a() {
        agke agkeVar;
        agkeVar = this.c;
        if (agkeVar == null) {
            agkeVar = (agke) Collection.EL.stream(this.a.g).flatMap(new rmm(10)).collect(aghu.a);
            this.c = agkeVar;
        }
        return agkeVar;
    }

    public final synchronized agke b() {
        agke agkeVar;
        agkeVar = this.b;
        if (agkeVar == null) {
            agkeVar = (agke) Collection.EL.stream(this.a.f).flatMap(new rmm(11)).collect(aghu.a);
            this.b = agkeVar;
        }
        return agkeVar;
    }
}
