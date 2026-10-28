package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.cardboard.sdk.R;
import java.lang.annotation.Annotation;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atqp {
    public static volatile avni a;
    public static volatile avnn b;
    public static volatile avnn c;
    public static volatile avnn d;
    public static volatile avnn e;
    public static volatile avnn f;
    public static volatile avnn g;
    public static volatile avnn h;
    public static volatile avnn i;
    public static volatile avnn j;
    public static volatile avnn k;
    public static volatile avnn l;
    public static volatile avnn m;
    public static volatile avnn n;
    public static volatile avnn o;
    public static volatile avnn p;
    public static volatile avnn q;
    public static volatile avnf r;
    public static volatile avnf s;
    public static volatile avnf t;
    public static volatile avnf u;
    public static volatile avnf v;
    public static volatile boolean w;
    public static volatile boolean x;

    private atqp() {
    }

    public static void A(AtomicReference atomicReference, avmn avmnVar, Class cls) {
        avmnVar.getClass();
        if (a.ap(atomicReference, avmnVar)) {
            return;
        }
        avmnVar.dispose();
        if (atomicReference.get() != avnr.DISPOSED) {
            z(cls);
        }
    }

    public static long B(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j4 = j3 + j2;
        } while (!atomicLong.compareAndSet(j3, j4 >= 0 ? j4 : Long.MAX_VALUE));
        return j3;
    }

    public static long C(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            long j5 = Long.MIN_VALUE;
            if (j3 != Long.MIN_VALUE) {
                j5 = Long.MAX_VALUE;
                if (j3 != Long.MAX_VALUE) {
                    j4 = j3 + j2;
                }
            }
            return j5;
        } while (!atomicLong.compareAndSet(j3, j4 >= 0 ? j4 : Long.MAX_VALUE));
        return j3;
    }

    public static long D(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static long E(long j2, long j3) {
        long j4 = j2 * j3;
        if (((j2 | j3) >>> 31) == 0 || j4 / j2 == j3) {
            return j4;
        }
        return Long.MAX_VALUE;
    }

    public static void F(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                n(new IllegalStateException(a.bS(j4, "More produced than requested: ")));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
    }

    public static void G(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MIN_VALUE || j3 == Long.MAX_VALUE) {
                return;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                n(new IllegalStateException(a.bS(j4, "More produced than requested: ")));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
    }

    public static int H(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
            case 57:
            default:
                return 0;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
        }
    }

    public static int I(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1) {
            return i2 != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int J(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
            default:
                return 0;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
        }
    }

    public static int K(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
            case 134:
            default:
                return 0;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return R.styleable.AppCompatTheme_windowMinWidthMajor;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return R.styleable.AppCompatTheme_windowMinWidthMinor;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            case 127:
                return SemanticState.Focused;
            case SemanticState.Focused /* 128 */:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return ModuleDescriptor.MODULE_VERSION;
            case ModuleDescriptor.MODULE_VERSION /* 216 */:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 221:
                return 222;
            case 222:
                return 223;
            case 223:
                return 224;
            case 224:
                return 225;
            case 225:
                return 226;
            case 226:
                return 227;
            case 227:
                return 228;
            case 228:
                return 229;
            case 229:
                return 230;
            case 230:
                return 231;
            case 231:
                return 232;
            case 232:
                return 233;
            case 233:
                return 234;
            case 234:
                return 235;
            case 235:
                return 236;
            case 236:
                return 237;
            case 237:
                return 238;
            case 238:
                return 239;
            case 239:
                return 240;
            case 240:
                return 241;
            case 241:
                return 242;
            case 242:
                return 243;
            case 243:
                return 244;
            case 244:
                return 245;
            case 245:
                return 246;
            case 246:
                return 247;
            case 247:
                return 248;
            case 248:
                return 249;
            case 249:
                return 250;
            case 250:
                return 251;
            case 251:
                return 252;
            case 252:
                return 253;
            case 253:
                return 254;
            case 254:
                return 255;
            case 255:
                return SemanticState.Hidden;
            case SemanticState.Hidden /* 256 */:
                return 257;
            case 257:
                return 258;
            case 258:
                return 259;
            case 259:
                return 260;
            case 260:
                return 261;
            case 261:
                return 262;
            case 262:
                return 263;
            case 263:
                return 264;
            case 264:
                return 265;
            case 265:
                return 266;
            case 266:
                return 267;
            case 267:
                return 268;
            case 268:
                return 269;
            case 269:
                return 270;
            case 270:
                return 271;
            case 271:
                return 272;
            case 272:
                return 273;
            case 273:
                return 274;
            case 274:
                return 275;
            case 275:
                return 276;
            case 276:
                return 277;
            case 277:
                return 278;
            case 278:
                return 279;
            case 279:
                return 280;
            case 280:
                return 281;
            case 281:
                return 282;
            case 282:
                return 283;
            case 283:
                return 284;
            case 284:
                return 285;
            case 285:
                return 286;
            case 286:
                return 287;
            case 287:
                return 288;
            case 288:
                return 289;
            case 289:
                return 290;
            case 290:
                return 291;
            case 291:
                return 292;
            case 292:
                return 293;
            case 293:
                return 294;
            case 294:
                return 295;
            case 295:
                return 296;
            case 296:
                return 297;
            case 297:
                return 298;
            case 298:
                return 299;
            case 299:
                return 300;
            case 300:
                return 301;
            case 301:
                return 302;
            case 302:
                return 303;
            case 303:
                return 304;
            case 304:
                return 305;
            case 305:
                return 306;
            case 306:
                return 307;
            case 307:
                return 308;
            case 308:
                return 309;
            case 309:
                return 310;
            case 310:
                return 311;
            case 311:
                return 312;
            case 312:
                return 313;
            case 313:
                return 314;
            case 314:
                return 315;
            case 315:
                return 316;
            case 316:
                return 317;
            case 317:
                return 318;
            case 318:
                return 319;
            case 319:
                return 320;
            case 320:
                return 321;
            case 321:
                return 322;
            case 322:
                return 323;
            case 323:
                return 324;
            case 324:
                return 325;
            case 325:
                return 326;
            case 326:
                return 327;
            case 327:
                return 328;
            case 328:
                return 329;
            case 329:
                return 330;
            case 330:
                return 331;
            case 331:
                return 332;
            case 332:
                return 333;
            case 333:
                return 334;
            case 334:
                return 335;
            case 335:
                return 336;
            case 336:
                return 337;
            case 337:
                return 338;
            case 338:
                return 339;
            case 339:
                return 340;
            case 340:
                return 341;
            case 341:
                return 342;
            case 342:
                return 343;
            case 343:
                return 344;
            case 344:
                return 345;
            case 345:
                return 346;
            case 346:
                return 347;
            case 347:
                return 348;
            case 348:
                return 349;
            case 349:
                return 350;
            case 350:
                return 351;
            case 351:
                return 352;
            case 352:
                return 353;
            case 353:
                return 354;
            case 354:
                return 355;
            case 355:
                return 356;
            case 356:
                return 357;
            case 357:
                return 358;
            case 358:
                return 359;
            case 359:
                return 360;
            case 360:
                return 361;
            case 361:
                return 362;
            case 362:
                return 363;
            case 363:
                return 364;
            case 364:
                return 365;
            case 365:
                return 366;
            case 366:
                return 367;
            case 367:
                return 368;
            case 368:
                return 369;
            case 369:
                return 370;
            case 370:
                return 371;
            case 371:
                return 372;
            case 372:
                return 373;
            case 373:
                return 374;
        }
    }

    public static /* synthetic */ String L(int i2) {
        if (i2 != 2) {
            return i2 != 3 ? "FOREGROUND_HEARTBEAT_TRIGGER_ON_BACKGROUND" : "FOREGROUND_HEARTBEAT_TRIGGER_ON_FOREGROUND";
        }
        return "FOREGROUND_HEARTBEAT_TRIGGER_ON_INTERVAL";
    }

    public static int M(int i2) {
        if (i2 != 0) {
            return i2 != 5 ? 0 : 7;
        }
        return 2;
    }

    public static int N(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            default:
                return 0;
        }
    }

    public static int O(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? 0 : 3;
        }
        return 2;
    }

    public static int P(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? 0 : 3;
        }
        return 2;
    }

    public static int Q(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
            default:
                return 0;
            case 8:
                return 9;
        }
    }

    public static byte[] R(akve akveVar) {
        try {
            int serializedSize = akveVar.getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            aigo aigoVar = new aigo(bArr, 0, serializedSize, null);
            if ((akveVar.b & 8) != 0) {
                aigoVar.i(2, akveVar.f);
            }
            if ((akveVar.b & 1) != 0) {
                aigoVar.z(4, akveVar.c);
            }
            if ((akveVar.b & 2) != 0) {
                int iAS = a.aS(akveVar.d);
                aigoVar.o(5, (iAS != 0 ? iAS : 1) - 1);
            }
            if ((akveVar.b & 4) != 0) {
                aigoVar.i(6, akveVar.e);
            }
            aigoVar.P();
            return bArr;
        } catch (Exception e2) {
            throw new RuntimeException("Serializing EntityKey to a byte array threw an Exception (should never happen).", e2);
        }
    }

    public static int S(int i2) {
        switch (i2) {
            case 0:
                return 15;
            case 1342:
                return 2;
            case 1516:
                return 9;
            case 1594:
                return 14;
            case 1635:
                return 13;
            case 50631000:
                return 6;
            case 138681548:
                return 1;
            case 153515154:
                return 7;
            case 184740635:
                return 3;
            case 194605894:
                return 4;
            case 257004480:
                return 12;
            case 260762012:
                return 8;
            case 302567585:
                return 5;
            case 333830980:
                return 10;
            case 508686415:
                return 11;
            default:
                return 0;
        }
    }

    public static int T(int i2) {
        if (i2 != 0) {
            return i2 != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int U(int i2) {
        if (i2 != 0) {
            return i2 != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int V(int i2) {
        if (i2 == 0) {
            return 1;
        }
        switch (i2) {
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return R.styleable.AppCompatTheme_windowMinWidthMajor;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return R.styleable.AppCompatTheme_windowMinWidthMinor;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            default:
                return 0;
        }
    }

    public static final /* synthetic */ ajwo W(aihh aihhVar) {
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        return (ajwo) aihnVarBuild;
    }

    public static Object a(Object obj, Class cls) {
        boolean z;
        if (!(obj instanceof aupg)) {
            if (obj instanceof auph) {
                return a(((auph) obj).generatedComponent(), cls);
            }
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), aupg.class, auph.class));
        }
        if (obj instanceof aupj) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (annotations[i2].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i2++;
            }
            atqq.c(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }

    public static bpl b(qe qeVar, bpl bplVar) {
        return ((aunx) a(qeVar, aunx.class)).bX().f(bplVar);
    }

    public static bpl c(cc ccVar, bpl bplVar) {
        return ((auny) a(ccVar, auny.class)).x().f(bplVar);
    }

    public static boolean d(Context context) {
        context.getClass();
        Set setDf = ((aunw) a(a.aJ(context.getApplicationContext()), aunw.class)).df();
        agpr agprVar = (agpr) setDf;
        atqq.c(agprVar.e <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setDf.isEmpty()) {
            return true;
        }
        return ((Boolean) agprVar.iterator().next()).booleanValue();
    }

    public static final void e(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(a.bQ(i3, i2, "index: ", ", size: "));
        }
    }

    public static final void f(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(a.bQ(i3, i2, "index: ", ", size: "));
        }
    }

    public static final void g(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(a.bQ(i3, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static final int h(int i2, int i3) {
        int i4 = i2 + (i2 >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if ((-2147483639) + i4 <= 0) {
            return i4;
        }
        if (i3 > 2147483639) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        return 2147483639;
    }

    public static final Object i(Throwable th) {
        th.getClass();
        return new awmm(th);
    }

    public static final void j(Object obj) throws Throwable {
        if (obj instanceof awmm) {
            throw ((awmm) obj).a;
        }
    }

    public static final awmi k(int i2, Function0 function0) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            return i3 != 1 ? new awmz(function0) : new awmo(function0);
        }
        return new awmp(function0);
    }

    public static avmb l(Callable callable) {
        try {
            avmb avmbVar = (avmb) callable.call();
            avmbVar.getClass();
            return avmbVar;
        } catch (Throwable th) {
            throw awkh.b(th);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    public static Runnable m(Runnable runnable) {
        runnable.getClass();
        avnn avnnVar = b;
        if (avnnVar == null) {
            return runnable;
        }
        try {
            return avnnVar.a(runnable);
        } catch (Throwable th) {
            throw awkh.b(th);
        }
    }

    public static void n(Throwable th) {
        avni avniVar = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof avmy) && !(th instanceof avmx) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof avmw)) {
            th = new avna(th);
        }
        if (avniVar != null) {
            try {
                avniVar.a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                o(th2);
            }
        }
        th.printStackTrace();
        o(th);
    }

    static void o(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static avot p(int i2) {
        return i2 < 0 ? new awig(-i2) : new awif(i2);
    }

    public static void q(axsq axsqVar, int i2) {
        axsqVar.ko(i2 < 0 ? Long.MAX_VALUE : i2);
    }

    static boolean r(avro avroVar) {
        try {
            return avroVar.i;
        } catch (Throwable th) {
            avkz.a(th);
            return true;
        }
    }

    public static boolean s(long j2, axsp axspVar, Queue queue, AtomicLong atomicLong, avro avroVar) {
        long j3 = j2 & Long.MIN_VALUE;
        while (true) {
            if (j3 != j2) {
                if (r(avroVar)) {
                    return true;
                }
                Object objPoll = queue.poll();
                if (objPoll == null) {
                    axspVar.kn();
                    return true;
                }
                axspVar.kk(objPoll);
                j3++;
            } else {
                if (r(avroVar)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    axspVar.kn();
                    return true;
                }
                j2 = atomicLong.get();
                if (j2 == j3) {
                    long jAddAndGet = atomicLong.addAndGet(-(j3 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j3 = jAddAndGet & Long.MIN_VALUE;
                    j2 = jAddAndGet;
                } else {
                    continue;
                }
            }
        }
    }

    public static void t(avos avosVar, axsp axspVar, avmn avmnVar, awkn awknVar) {
        int iG = 1;
        while (true) {
            boolean zK = awknVar.k();
            Object objKm = avosVar.km();
            if (!awknVar.j()) {
                if (zK && objKm == null) {
                    axspVar.kn();
                    break;
                }
                if (objKm == null) {
                    iG = awknVar.g(-iG);
                    if (iG == 0) {
                        return;
                    }
                } else {
                    long jH = awknVar.h();
                    if (jH == 0) {
                        avosVar.c();
                        if (avmnVar != null) {
                            avmnVar.dispose();
                        }
                        axspVar.b(new avmx("Could not emit value due to lack of requests."));
                        return;
                    }
                    awknVar.d(axspVar, objKm);
                    if (jH != Long.MAX_VALUE) {
                        awknVar.o();
                    }
                }
            } else {
                avosVar.c();
                break;
            }
        }
        if (avmnVar != null) {
            avmnVar.dispose();
        }
    }

    public static void u(avlw avlwVar, AtomicInteger atomicInteger, awkd awkdVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thD = awkh.d(awkdVar);
            if (thD != null) {
                avlwVar.b(thD);
            } else {
                avlwVar.kn();
            }
        }
    }

    public static void v(axsp axspVar, AtomicInteger atomicInteger, awkd awkdVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thD = awkh.d(awkdVar);
            if (thD != null) {
                axspVar.b(thD);
            } else {
                axspVar.kn();
            }
        }
    }

    public static void w(avlw avlwVar, Throwable th, AtomicInteger atomicInteger, awkd awkdVar) {
        if (!awkh.e(awkdVar, th)) {
            n(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            avlwVar.b(awkh.d(awkdVar));
        }
    }

    public static void x(axsp axspVar, Throwable th, AtomicInteger atomicInteger, awkd awkdVar) {
        if (!awkh.e(awkdVar, th)) {
            n(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            axspVar.b(awkh.d(awkdVar));
        }
    }

    public static void y(axsp axspVar, Object obj, AtomicInteger atomicInteger, awkd awkdVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            axspVar.kk(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thD = awkh.d(awkdVar);
                if (thD != null) {
                    axspVar.b(thD);
                } else {
                    axspVar.kn();
                }
            }
        }
    }

    public static void z(Class cls) {
        String name = cls.getName();
        n(new avmz("It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead."));
    }
}
