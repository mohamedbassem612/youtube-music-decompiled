package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wsk extends wnl {
    final /* synthetic */ wsl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsk(wsl wslVar, wlp wlpVar) {
        super(wlpVar, wslVar.e(), alvy.a, new wsj(0), new wrj(17));
        this.a = wslVar;
    }

    @Override // defpackage.wnl
    public final /* bridge */ /* synthetic */ Object h(MessageLite messageLite) {
        return (alvy) messageLite;
    }

    @Override // defpackage.wnl
    public final /* bridge */ /* synthetic */ void m(wlu wluVar, Object obj) {
        aotg aotgVarA;
        alvy alvyVar = (alvy) obj;
        alvx alvxVar = (alvx) ((aihf) wluVar.a()).build();
        wsl wslVar = this.a;
        wby wbyVarC = wslVar.e.c();
        String str = (alvyVar.b & 32768) != 0 ? alvyVar.m : alvxVar.d;
        for (aote aoteVar : alvxVar.e) {
            int i = aoteVar.d;
            aotd aotdVarA = aotd.a(i);
            if (aotdVarA == null) {
                aotdVarA = aotd.ACTION_UNKNOWN;
            }
            int i2 = 9;
            int i3 = 10;
            int i4 = 1;
            if (aotdVarA == aotd.ACTION_ADD_VIDEO) {
                String strG = wfs.g(231, aoteVar.e);
                avlm avlmVarG = wbyVarC.g(strG);
                strG.getClass();
                ahno.P(!strG.isEmpty(), "key cannot be empty");
                aihf aihfVarCreateBuilder = apmi.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                apmi apmiVar = (apmi) aihfVarCreateBuilder.instance;
                apmiVar.b |= 1;
                apmiVar.c = strG;
                avlmVarG.w(avlm.q(new apmf(aihfVarCreateBuilder).am())).g(apmh.class).n(new wsh(str, i4)).c(new hpn(wbyVarC, str, i3)).F(new hrj(8), new vqe(i2));
                tbt tbtVar = wslVar.d;
                String str2 = aoteVar.e;
                String str3 = alvxVar.f;
                alwa alwaVar = alwa.a;
                alwa alwaVar2 = (alwa) zik.cf(str3, aihn.getParserForClass(alwa.class));
                if (alwaVar2 == null || (aotgVarA = aotg.a(alwaVar2.b)) == null) {
                    aotgVarA = aotg.PAGE_SOURCE_UNKNOWN;
                }
                tbtVar.c(new wss(str, str2, aotgVarA, alvyVar));
            } else {
                aotd aotdVarA2 = aotd.a(i);
                if (aotdVarA2 == null) {
                    aotdVarA2 = aotd.ACTION_UNKNOWN;
                }
                int i5 = 0;
                if (aotdVarA2 != aotd.ACTION_REMOVE_VIDEO) {
                    aotd aotdVarA3 = aotd.a(i);
                    if (aotdVarA3 == null) {
                        aotdVarA3 = aotd.ACTION_UNKNOWN;
                    }
                    if (aotdVarA3 != aotd.ACTION_REMOVE_VIDEO_BY_VIDEO_ID) {
                        aotd aotdVarA4 = aotd.a(i);
                        if (aotdVarA4 == null) {
                            aotdVarA4 = aotd.ACTION_UNKNOWN;
                        }
                        if (aotdVarA4 != aotd.ACTION_MOVE_VIDEO_BEFORE) {
                            aotd aotdVarA5 = aotd.a(i);
                            if (aotdVarA5 == null) {
                                aotdVarA5 = aotd.ACTION_UNKNOWN;
                            }
                            if (aotdVarA5 == aotd.ACTION_MOVE_VIDEO_AFTER) {
                                wslVar.d.c(new wst(alvxVar.d, aoteVar.f, aoteVar.g, alvyVar));
                            } else {
                                aotd aotdVarA6 = aotd.a(i);
                                if (aotdVarA6 == null) {
                                    aotdVarA6 = aotd.ACTION_UNKNOWN;
                                }
                                if (aotdVarA6 == aotd.ACTION_SET_CLOSED_TO_CONTRIBUTIONS) {
                                    tbt tbtVar2 = wslVar.d;
                                    tbtVar2.c(new wsn(alvxVar.d, aoteVar.n, true));
                                    tbtVar2.c(new wsp(alvxVar.d, alvyVar));
                                } else {
                                    aotd aotdVarA7 = aotd.a(i);
                                    if (aotdVarA7 == null) {
                                        aotdVarA7 = aotd.ACTION_UNKNOWN;
                                    }
                                    if (aotdVarA7 == aotd.ACTION_CREATE_COLLABORATION_INVITE_LINK) {
                                        wslVar.d.c(new wsm(alvxVar.d, typ.c(alvyVar.h), true));
                                    } else {
                                        aotd aotdVarA8 = aotd.a(i);
                                        if (aotdVarA8 == null) {
                                            aotdVarA8 = aotd.ACTION_UNKNOWN;
                                        }
                                        if (aotdVarA8 == aotd.ACTION_REVOKE_COLLABORATION_TOKENS) {
                                            wslVar.d.c(new wsq(alvxVar.d, true));
                                        } else {
                                            aotd aotdVarA9 = aotd.a(i);
                                            if (aotdVarA9 == null) {
                                                aotdVarA9 = aotd.ACTION_UNKNOWN;
                                            }
                                            if (aotdVarA9 == aotd.ACTION_SET_PLAYLIST_VIDEO_ORDER) {
                                                wslVar.d.c(new wsp(alvxVar.d, alvyVar));
                                            } else {
                                                aotd aotdVarA10 = aotd.a(i);
                                                if (aotdVarA10 == null) {
                                                    aotdVarA10 = aotd.ACTION_UNKNOWN;
                                                }
                                                if (aotdVarA10 == aotd.ACTION_REMOVE_WATCHED_VIDEOS) {
                                                    wslVar.d.c(new wsp(alvxVar.d, alvyVar));
                                                } else {
                                                    aotd aotdVarA11 = aotd.a(i);
                                                    if (aotdVarA11 == null) {
                                                        aotdVarA11 = aotd.ACTION_UNKNOWN;
                                                    }
                                                    if (aotdVarA11 == aotd.ACTION_SET_PLAYLIST_PRIVACY) {
                                                        wslVar.d.c(new wso(alvxVar.d, alvyVar));
                                                    } else {
                                                        aotd aotdVarA12 = aotd.a(i);
                                                        if (aotdVarA12 == null) {
                                                            aotdVarA12 = aotd.ACTION_UNKNOWN;
                                                        }
                                                        if (aotdVarA12 == aotd.ACTION_SET_ALLOW_ITEM_VOTE) {
                                                            wslVar.d.c(new wsp(alvxVar.d, alvyVar));
                                                        } else {
                                                            aotd aotdVarA13 = aotd.a(i);
                                                            if (aotdVarA13 == null) {
                                                                aotdVarA13 = aotd.ACTION_UNKNOWN;
                                                            }
                                                            if (aotdVarA13 == aotd.ACTION_SET_ALLOW_COMMENT) {
                                                                wslVar.d.c(new wsp(alvxVar.d, alvyVar));
                                                            } else {
                                                                if (wslVar.g.l(168, 45644282L, false)) {
                                                                    aotd aotdVarA14 = aotd.a(aoteVar.d);
                                                                    if (aotdVarA14 == null) {
                                                                        aotdVarA14 = aotd.ACTION_UNKNOWN;
                                                                    }
                                                                    aotd aotdVar = aotd.ACTION_SET_CUSTOM_THUMBNAIL;
                                                                    if (aotdVarA14 == aotdVar) {
                                                                        wslVar.d.c(new wsp(alvxVar.d, alvyVar, aotdVar));
                                                                    }
                                                                }
                                                                int i6 = aoteVar.d;
                                                                aotd aotdVarA15 = aotd.a(i6);
                                                                if (aotdVarA15 == null) {
                                                                    aotdVarA15 = aotd.ACTION_UNKNOWN;
                                                                }
                                                                aotd aotdVar2 = aotd.ACTION_JOIN_COLLABORATION;
                                                                if (aotdVarA15 == aotdVar2) {
                                                                    wslVar.d.c(new wsp(alvxVar.d, alvyVar, aotdVar2));
                                                                } else {
                                                                    aotd aotdVarA16 = aotd.a(i6);
                                                                    if (aotdVarA16 == null) {
                                                                        aotdVarA16 = aotd.ACTION_UNKNOWN;
                                                                    }
                                                                    aotd aotdVar3 = aotd.ACTION_COPY_FROM_PLAYLIST;
                                                                    if (aotdVarA16 == aotdVar3) {
                                                                        wslVar.d.c(new wsp(alvxVar.d, alvyVar, aotdVar3));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (!wslVar.f.l(18, 45631007L, false)) {
                            wslVar.d.c(new wsu(alvxVar.d, aoteVar.f, aoteVar.h));
                        }
                    }
                }
                wbyVarC.g(wfs.g(231, aoteVar.m)).g(apmh.class).n(new wsh(str, i5)).c(new hpn(wbyVarC, str, 11)).F(new hrj(9), new vqe(i3));
                wslVar.d.c(new wsv(alvxVar.d, aoteVar.m, aoteVar.f, alvyVar));
            }
        }
    }

    @Override // defpackage.wnl
    public final void n(wlu wluVar) {
        alvx alvxVar = (alvx) ((aihf) wluVar.a()).build();
        for (aote aoteVar : alvxVar.e) {
            int i = aoteVar.d;
            aotd aotdVarA = aotd.a(i);
            if (aotdVarA == null) {
                aotdVarA = aotd.ACTION_UNKNOWN;
            }
            wsl wslVar = this.a;
            if (aotdVarA == aotd.ACTION_SET_CLOSED_TO_CONTRIBUTIONS) {
                wslVar.d.c(new wsn(alvxVar.d, aoteVar.n, false));
            } else {
                aotd aotdVarA2 = aotd.a(i);
                if (aotdVarA2 == null) {
                    aotdVarA2 = aotd.ACTION_UNKNOWN;
                }
                if (aotdVarA2 == aotd.ACTION_CREATE_COLLABORATION_INVITE_LINK) {
                    wslVar.d.c(new wsm(alvxVar.d, "", false));
                } else {
                    aotd aotdVarA3 = aotd.a(i);
                    if (aotdVarA3 == null) {
                        aotdVarA3 = aotd.ACTION_UNKNOWN;
                    }
                    if (aotdVarA3 == aotd.ACTION_REVOKE_COLLABORATION_TOKENS) {
                        wslVar.d.c(new wsq(alvxVar.d, false));
                    } else {
                        aotd aotdVarA4 = aotd.a(i);
                        if (aotdVarA4 == null) {
                            aotdVarA4 = aotd.ACTION_UNKNOWN;
                        }
                        if (aotdVarA4 == aotd.ACTION_ADD_VIDEO) {
                            wslVar.d.c(new wsr(alvxVar.d, aoteVar.e));
                        }
                    }
                }
            }
        }
    }
}
