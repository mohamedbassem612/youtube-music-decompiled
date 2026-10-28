package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rln extends admr {
    public final rps a;
    public xgz b;
    public ajwo c;
    private final View d;
    private final TextView e;
    private final ImageView f;
    private final xgn g;
    private final boolean h;

    public rln(Context context, vxe vxeVar, rps rpsVar, xgn xgnVar, boolean z) {
        View viewInflate;
        this.a = rpsVar;
        this.g = xgnVar;
        this.h = z;
        if (z) {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.general_account_footer_layout, (ViewGroup) null);
            this.d = viewInflate;
        } else {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.general_account_footer_layout_old, (ViewGroup) null);
            this.d = viewInflate;
        }
        this.e = (TextView) viewInflate.findViewById(R.id.footer_text);
        this.f = (ImageView) viewInflate.findViewById(R.id.footer_icon);
        viewInflate.setOnClickListener(new ivx(this, xgnVar, vxeVar, 6, (int[]) null));
    }

    private static final boolean g(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aqcg.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        ajwo ajwoVar;
        ajwo ajwoVar2;
        aihl aihlVarCheckIsLite;
        aihl aihlVarCheckIsLite2;
        aihl aihlVarCheckIsLite3;
        Object objK;
        Object objC;
        ajmf ajmfVar;
        boolean zEquals;
        aihl aihlVarCheckIsLite4;
        Object objK2;
        Object objC2;
        apxs apxsVar;
        int i;
        akud akudVar;
        akud akudVar2;
        aihl aihlVarCheckIsLite5;
        airn airnVar = (airn) obj;
        this.b = null;
        ajwo ajwoVar3 = airnVar.c;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        this.c = ajwoVar3;
        TextView textView = this.e;
        if (textView != null) {
            alay alayVar = airnVar.b;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            textView.setText(ackj.k(null, alayVar, null, false));
        }
        ImageView imageView = this.f;
        if (imageView != null && this.h) {
            if (g(this.c)) {
                imageView.setImageResource(R.drawable.yt_outline_experimental_person_child_black_24);
                imageView.setVisibility(0);
            } else {
                ajwo ajwoVar4 = this.c;
                if (ajwoVar4 != null) {
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apzp.a);
                    ajwoVar4.c(aihlVarCheckIsLite6);
                    if (ajwoVar4.j.n(aihlVarCheckIsLite6.d)) {
                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(apzp.a);
                        ajwoVar4.c(aihlVarCheckIsLite7);
                        Object objK3 = ajwoVar4.j.k(aihlVarCheckIsLite7.d);
                        if ((((apzo) (objK3 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK3))).b & 2) != 0) {
                            imageView.setImageResource(R.drawable.yt_outline_experimental_incognito_black_24);
                            imageView.setVisibility(0);
                        } else {
                            ajwoVar = this.c;
                            if (ajwoVar != null) {
                                aihlVarCheckIsLite5 = aihn.checkIsLite(aojy.b);
                                ajwoVar.c(aihlVarCheckIsLite5);
                                if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                                    imageView.setImageResource(R.drawable.yt_fill_experimental_google_black_24);
                                    imageView.setVisibility(0);
                                } else {
                                    ajwoVar2 = this.c;
                                    if (ajwoVar2 != null) {
                                        aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                                        ajwoVar2.c(aihlVarCheckIsLite);
                                        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                            aihlVarCheckIsLite4 = aihn.checkIsLite(apxs.b);
                                            ajwoVar2.c(aihlVarCheckIsLite4);
                                            objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                                            if (objK2 == null) {
                                                objC2 = aihlVarCheckIsLite4.b;
                                            } else {
                                                objC2 = aihlVarCheckIsLite4.c(objK2);
                                            }
                                            apxsVar = (apxs) objC2;
                                            apxsVar.getClass();
                                            i = apxsVar.d;
                                            if (i != 10) {
                                                zEquals = false;
                                            } else {
                                                if (i == 10) {
                                                    akudVar = (akud) apxsVar.e;
                                                } else {
                                                    akudVar = akud.a;
                                                }
                                                if ((akudVar.b & 2) != 0) {
                                                    if (apxsVar.d == 10) {
                                                        akudVar2 = (akud) apxsVar.e;
                                                    } else {
                                                        akudVar2 = akud.a;
                                                    }
                                                    zEquals = akudVar2.d.equals("PAfeature_enablement");
                                                } else {
                                                    zEquals = false;
                                                }
                                            }
                                            if (zEquals) {
                                                imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                                imageView.setVisibility(0);
                                            }
                                        } else {
                                            aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                                            ajwoVar2.c(aihlVarCheckIsLite2);
                                            if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                                                aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                                                ajwoVar2.c(aihlVarCheckIsLite3);
                                                objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                                                if (objK == null) {
                                                    objC = aihlVarCheckIsLite3.b;
                                                } else {
                                                    objC = aihlVarCheckIsLite3.c(objK);
                                                }
                                                ajmfVar = (ajmf) objC;
                                                ajmfVar.getClass();
                                                if ((ajmfVar.b & 1) == 0 && ajmfVar.c.equals("FEsandbox_onboarding")) {
                                                    zEquals = true;
                                                } else {
                                                    zEquals = false;
                                                }
                                                if (zEquals) {
                                                    imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                                    imageView.setVisibility(0);
                                                }
                                            }
                                        }
                                        imageView.setVisibility(8);
                                    } else {
                                        imageView.setVisibility(8);
                                    }
                                }
                            } else {
                                ajwoVar2 = this.c;
                                if (ajwoVar2 != null) {
                                    aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                                    ajwoVar2.c(aihlVarCheckIsLite);
                                    if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                        aihlVarCheckIsLite4 = aihn.checkIsLite(apxs.b);
                                        ajwoVar2.c(aihlVarCheckIsLite4);
                                        objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                                        if (objK2 == null) {
                                            objC2 = aihlVarCheckIsLite4.b;
                                        } else {
                                            objC2 = aihlVarCheckIsLite4.c(objK2);
                                        }
                                        apxsVar = (apxs) objC2;
                                        apxsVar.getClass();
                                        i = apxsVar.d;
                                        if (i != 10) {
                                            zEquals = false;
                                        } else {
                                            if (i == 10) {
                                                akudVar = (akud) apxsVar.e;
                                            } else {
                                                akudVar = akud.a;
                                            }
                                            if ((akudVar.b & 2) != 0) {
                                                if (apxsVar.d == 10) {
                                                    akudVar2 = (akud) apxsVar.e;
                                                } else {
                                                    akudVar2 = akud.a;
                                                }
                                                zEquals = akudVar2.d.equals("PAfeature_enablement");
                                            } else {
                                                zEquals = false;
                                            }
                                        }
                                        if (zEquals) {
                                            imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                            imageView.setVisibility(0);
                                        }
                                    } else {
                                        aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                                        ajwoVar2.c(aihlVarCheckIsLite2);
                                        if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                                            aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                                            ajwoVar2.c(aihlVarCheckIsLite3);
                                            objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                                            if (objK == null) {
                                                objC = aihlVarCheckIsLite3.b;
                                            } else {
                                                objC = aihlVarCheckIsLite3.c(objK);
                                            }
                                            ajmfVar = (ajmf) objC;
                                            ajmfVar.getClass();
                                            if ((ajmfVar.b & 1) == 0) {
                                                zEquals = false;
                                            } else {
                                                zEquals = false;
                                            }
                                            if (zEquals) {
                                                imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                                imageView.setVisibility(0);
                                            }
                                        }
                                    }
                                    imageView.setVisibility(8);
                                } else {
                                    imageView.setVisibility(8);
                                }
                            }
                        }
                    } else {
                        ajwoVar = this.c;
                        if (ajwoVar != null) {
                            aihlVarCheckIsLite5 = aihn.checkIsLite(aojy.b);
                            ajwoVar.c(aihlVarCheckIsLite5);
                            if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                                imageView.setImageResource(R.drawable.yt_fill_experimental_google_black_24);
                                imageView.setVisibility(0);
                            } else {
                                ajwoVar2 = this.c;
                                if (ajwoVar2 != null) {
                                    aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                                    ajwoVar2.c(aihlVarCheckIsLite);
                                    if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                        aihlVarCheckIsLite4 = aihn.checkIsLite(apxs.b);
                                        ajwoVar2.c(aihlVarCheckIsLite4);
                                        objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                                        if (objK2 == null) {
                                            objC2 = aihlVarCheckIsLite4.b;
                                        } else {
                                            objC2 = aihlVarCheckIsLite4.c(objK2);
                                        }
                                        apxsVar = (apxs) objC2;
                                        apxsVar.getClass();
                                        i = apxsVar.d;
                                        if (i != 10) {
                                            zEquals = false;
                                        } else {
                                            if (i == 10) {
                                                akudVar = (akud) apxsVar.e;
                                            } else {
                                                akudVar = akud.a;
                                            }
                                            if ((akudVar.b & 2) != 0) {
                                                if (apxsVar.d == 10) {
                                                    akudVar2 = (akud) apxsVar.e;
                                                } else {
                                                    akudVar2 = akud.a;
                                                }
                                                zEquals = akudVar2.d.equals("PAfeature_enablement");
                                            } else {
                                                zEquals = false;
                                            }
                                        }
                                        if (zEquals) {
                                            imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                            imageView.setVisibility(0);
                                        }
                                    } else {
                                        aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                                        ajwoVar2.c(aihlVarCheckIsLite2);
                                        if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                                            aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                                            ajwoVar2.c(aihlVarCheckIsLite3);
                                            objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                                            if (objK == null) {
                                                objC = aihlVarCheckIsLite3.b;
                                            } else {
                                                objC = aihlVarCheckIsLite3.c(objK);
                                            }
                                            ajmfVar = (ajmf) objC;
                                            ajmfVar.getClass();
                                            if ((ajmfVar.b & 1) == 0) {
                                                zEquals = false;
                                            } else {
                                                zEquals = false;
                                            }
                                            if (zEquals) {
                                                imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                                imageView.setVisibility(0);
                                            }
                                        }
                                    }
                                    imageView.setVisibility(8);
                                } else {
                                    imageView.setVisibility(8);
                                }
                            }
                        } else {
                            ajwoVar2 = this.c;
                            if (ajwoVar2 != null) {
                                aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                                ajwoVar2.c(aihlVarCheckIsLite);
                                if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                    aihlVarCheckIsLite4 = aihn.checkIsLite(apxs.b);
                                    ajwoVar2.c(aihlVarCheckIsLite4);
                                    objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                                    if (objK2 == null) {
                                        objC2 = aihlVarCheckIsLite4.b;
                                    } else {
                                        objC2 = aihlVarCheckIsLite4.c(objK2);
                                    }
                                    apxsVar = (apxs) objC2;
                                    apxsVar.getClass();
                                    i = apxsVar.d;
                                    if (i != 10) {
                                        zEquals = false;
                                    } else {
                                        if (i == 10) {
                                            akudVar = (akud) apxsVar.e;
                                        } else {
                                            akudVar = akud.a;
                                        }
                                        if ((akudVar.b & 2) != 0) {
                                            if (apxsVar.d == 10) {
                                                akudVar2 = (akud) apxsVar.e;
                                            } else {
                                                akudVar2 = akud.a;
                                            }
                                            zEquals = akudVar2.d.equals("PAfeature_enablement");
                                        } else {
                                            zEquals = false;
                                        }
                                    }
                                    if (zEquals) {
                                        imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                        imageView.setVisibility(0);
                                    }
                                } else {
                                    aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                                    ajwoVar2.c(aihlVarCheckIsLite2);
                                    if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                                        aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                                        ajwoVar2.c(aihlVarCheckIsLite3);
                                        objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                                        if (objK == null) {
                                            objC = aihlVarCheckIsLite3.b;
                                        } else {
                                            objC = aihlVarCheckIsLite3.c(objK);
                                        }
                                        ajmfVar = (ajmf) objC;
                                        ajmfVar.getClass();
                                        if ((ajmfVar.b & 1) == 0) {
                                            zEquals = false;
                                        } else {
                                            zEquals = false;
                                        }
                                        if (zEquals) {
                                            imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                            imageView.setVisibility(0);
                                        }
                                    }
                                }
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(8);
                            }
                        }
                    }
                } else {
                    ajwoVar = this.c;
                    if (ajwoVar != null) {
                        aihlVarCheckIsLite5 = aihn.checkIsLite(aojy.b);
                        ajwoVar.c(aihlVarCheckIsLite5);
                        if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                            imageView.setImageResource(R.drawable.yt_fill_experimental_google_black_24);
                            imageView.setVisibility(0);
                        } else {
                            ajwoVar2 = this.c;
                            if (ajwoVar2 != null) {
                                aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                                ajwoVar2.c(aihlVarCheckIsLite);
                                if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                    aihlVarCheckIsLite4 = aihn.checkIsLite(apxs.b);
                                    ajwoVar2.c(aihlVarCheckIsLite4);
                                    objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                                    if (objK2 == null) {
                                        objC2 = aihlVarCheckIsLite4.b;
                                    } else {
                                        objC2 = aihlVarCheckIsLite4.c(objK2);
                                    }
                                    apxsVar = (apxs) objC2;
                                    apxsVar.getClass();
                                    i = apxsVar.d;
                                    if (i != 10) {
                                        zEquals = false;
                                    } else {
                                        if (i == 10) {
                                            akudVar = (akud) apxsVar.e;
                                        } else {
                                            akudVar = akud.a;
                                        }
                                        if ((akudVar.b & 2) != 0) {
                                            if (apxsVar.d == 10) {
                                                akudVar2 = (akud) apxsVar.e;
                                            } else {
                                                akudVar2 = akud.a;
                                            }
                                            zEquals = akudVar2.d.equals("PAfeature_enablement");
                                        } else {
                                            zEquals = false;
                                        }
                                    }
                                    if (zEquals) {
                                        imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                        imageView.setVisibility(0);
                                    }
                                } else {
                                    aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                                    ajwoVar2.c(aihlVarCheckIsLite2);
                                    if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                                        aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                                        ajwoVar2.c(aihlVarCheckIsLite3);
                                        objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                                        if (objK == null) {
                                            objC = aihlVarCheckIsLite3.b;
                                        } else {
                                            objC = aihlVarCheckIsLite3.c(objK);
                                        }
                                        ajmfVar = (ajmf) objC;
                                        ajmfVar.getClass();
                                        if ((ajmfVar.b & 1) == 0) {
                                            zEquals = false;
                                        } else {
                                            zEquals = false;
                                        }
                                        if (zEquals) {
                                            imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                            imageView.setVisibility(0);
                                        }
                                    }
                                }
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(8);
                            }
                        }
                    } else {
                        ajwoVar2 = this.c;
                        if (ajwoVar2 != null) {
                            aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                            ajwoVar2.c(aihlVarCheckIsLite);
                            if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                aihlVarCheckIsLite4 = aihn.checkIsLite(apxs.b);
                                ajwoVar2.c(aihlVarCheckIsLite4);
                                objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                                if (objK2 == null) {
                                    objC2 = aihlVarCheckIsLite4.b;
                                } else {
                                    objC2 = aihlVarCheckIsLite4.c(objK2);
                                }
                                apxsVar = (apxs) objC2;
                                apxsVar.getClass();
                                i = apxsVar.d;
                                if (i != 10) {
                                    zEquals = false;
                                } else {
                                    if (i == 10) {
                                        akudVar = (akud) apxsVar.e;
                                    } else {
                                        akudVar = akud.a;
                                    }
                                    if ((akudVar.b & 2) != 0) {
                                        if (apxsVar.d == 10) {
                                            akudVar2 = (akud) apxsVar.e;
                                        } else {
                                            akudVar2 = akud.a;
                                        }
                                        zEquals = akudVar2.d.equals("PAfeature_enablement");
                                    } else {
                                        zEquals = false;
                                    }
                                }
                                if (zEquals) {
                                    imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                    imageView.setVisibility(0);
                                }
                            } else {
                                aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                                ajwoVar2.c(aihlVarCheckIsLite2);
                                if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                                    aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                                    ajwoVar2.c(aihlVarCheckIsLite3);
                                    objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                                    if (objK == null) {
                                        objC = aihlVarCheckIsLite3.b;
                                    } else {
                                        objC = aihlVarCheckIsLite3.c(objK);
                                    }
                                    ajmfVar = (ajmf) objC;
                                    ajmfVar.getClass();
                                    if ((ajmfVar.b & 1) == 0) {
                                        zEquals = false;
                                    } else {
                                        zEquals = false;
                                    }
                                    if (zEquals) {
                                        imageView.setImageResource(R.drawable.yt_outline_experimental_add_black_24);
                                        imageView.setVisibility(0);
                                    }
                                }
                            }
                            imageView.setVisibility(8);
                        } else {
                            imageView.setVisibility(8);
                        }
                    }
                }
            }
        }
        if (g(this.c)) {
            xgj xgjVar = new xgj(xhb.b(275676));
            this.b = xgjVar;
            this.g.l(xgjVar);
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return new byte[0];
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
