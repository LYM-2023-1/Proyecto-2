// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/P2.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class P2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=4;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=8;
      Object coder=$fix(P2.createCoder());
      $line=9;
      Object deCoder=$fix(P2.createDecoder());
      $line=10;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,coder));
      $line=15;
      P2.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"main",$line);
    }
  }
  public static Object testCodeDecode(ITransducer C, ITransducer D) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=22;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=26;
      System.out.println($message(new Object[]{"Testing Coder-Decoder"}));
      $line=27;
      Object string=$fix(" ");
      $line=28;
      while (true) {
        if (!(!$opEqualY(string,""))) break;
        $line=29;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=30;
        System.out.println($message(new Object[]{"Input string: (empty string to end)"}));
        $line=31;
        if (!$opEqualY(string,"")) {
          $line=33;
          string=$fix(((java.util.Scanner)sc).nextLine());
          $line=34;
          if (!$opEqualY(string,"")) {
            $line=36;
            Object option=$fix("");
            $line=37;
            while (true) {
              if (!(!$opMembrY(option,GCollections.asSet("1","2","3")))) break;
              $line=38;
              System.out.println($message(new Object[]{"What do you want to do?"}));
              $line=39;
              System.out.println($message(new Object[]{"1. code only?"}));
              $line=40;
              System.out.println($message(new Object[]{"2. code and decode?"}));
              $line=41;
              System.out.println($message(new Object[]{"3. decode only?"}));
              $line=43;
              option=$fix(((java.util.Scanner)sc).nextLine());
            }
            $line=45;
            Object stringOut=$fix("");
            $line=46;
            if (($opEqualY(option,"1")||$opEqualY(option,"2"))) {
              $line=47;
              Object result=$fix(((gold.structures.automaton.ITransducer)C).acceptsString($cast(java.lang.String.class,string)));
              $line=48;
              System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The string was ",(($bool(result))?("accepted"):("not accepted"))),". Output: "),((gold.structures.automaton.ITransducer)C).getOutputString())}));
              $line=49;
              stringOut=$fix(((gold.structures.automaton.ITransducer)C).getOutputString());
              $line=50;
              if ($opEqualY(option,"2")) {
                $line=51;
                result=$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,stringOut)));
                $line=52;
                System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The coded string was ",(($bool(result))?("accepted"):("not accepted"))),". Output: "),((gold.structures.automaton.ITransducer)D).getOutputString())}));
                $line=53;
                Object stringOut1=$fix(((gold.structures.automaton.ITransducer)D).getOutputString());
                $line=54;
                System.out.println($message(new Object[]{$opAdditY($opAdditY("The decoded string is ",((!$opEqualY(stringOut1,string))?("not "):(""))),"equal to the original string.")}));
              }
            }
            else {
              $line=58;
              Object result=$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,string)));
              $line=59;
              System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The string was ",(($bool(result))?("accepted"):("not accepted")))," by the decoder. Output: "),((gold.structures.automaton.ITransducer)D).getOutputString())}));
            }
          }
        }
      }
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"testCodeDecode",$line);
    }
    return $result;
  }
  public static Object getName() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=72;
      $result="Proyecto-2";
      if (true) break $try;
      $line=73;
      $rethrow(new RuntimeException("The function \"getName()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"getName",$line);
    }
    return $result;
  }
  public static GHashTableMap delta=null;
  static {
    int $line=0;
    $line=75;
    $try:try {
      delta=$invokeConstructor(GHashTableMap.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,null,$line);
    }
  }
  public static GHashTableMap outputT=null;
  static {
    int $line=0;
    $line=76;
    $try:try {
      outputT=$invokeConstructor(GHashTableMap.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,null,$line);
    }
  }
  public static IAutomaton createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=79;
      Object Q=$fix(GCollections.asSet("o","a","b","c","aa","ab","ac","ba","bb","bc","ca","cb","cc","aaa","aab","aac","aba","abb","abc","aca","acb","acc","baa","bab","bac","bba","bbb","bbc","bca","bcb","bcc","caa","cab","cac","cba","cbb","cbc","cca","ccb","ccc",0));
      $line=80;
      Object \u03A3=$fix(GCollections.asSet('a','b','c','&'));
      $line=81;
      Object O=$fix(GCollections.asSet('a','b','c','*','&'));
      $line=83;
      Object q_0=$fix("o");
      $line=84;
      Object F=$fix(GCollections.asSet("aaa","aab","aac","aba","abb","abc","aca","acb","acc","baa","bab","bac","bba","bbb","bbc","bca","bcb","bcc","caa","cab","cac","cba","cbb","cbc","cca","ccb","ccc"));
      $line=87;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("aaa",'&'),"&");
      $line=88;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("aab",'&'),"&");
      $line=89;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("aac",'&'),"&");
      $line=91;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("aba",'&'),"&");
      $line=92;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("abb",'&'),"&");
      $line=93;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("abc",'&'),"&");
      $line=95;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("aca",'&'),"&");
      $line=96;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("acb",'&'),"&");
      $line=97;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("acc",'&'),"&");
      $line=99;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("baa",'&'),"&");
      $line=100;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("bab",'&'),"&");
      $line=101;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("bac",'&'),"&");
      $line=103;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("bba",'&'),"&");
      $line=104;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("bbb",'&'),"&");
      $line=105;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("bbc",'&'),"&");
      $line=107;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("bca",'&'),"&");
      $line=108;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("bcb",'&'),"&");
      $line=109;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("bcc",'&'),"&");
      $line=111;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("caa",'&'),"&");
      $line=112;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("cab",'&'),"&");
      $line=113;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("cac",'&'),"&");
      $line=115;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("cba",'&'),"&");
      $line=116;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("cbb",'&'),"&");
      $line=117;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("cbc",'&'),"&");
      $line=119;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("cca",'&'),"&");
      $line=120;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("ccb",'&'),"&");
      $line=121;
      ((gold.structures.map.GHashTableMap)outputT).put(GCollections.asList("ccc",'&'),"&");
      $line=124;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("o",'a'),"a");
      $line=125;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("o",'b'),"b");
      $line=126;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("o",'c'),"c");
      $line=128;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("a",'a'),"aa");
      $line=129;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("a",'b'),"ab");
      $line=130;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("a",'c'),"ac");
      $line=132;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("b",'a'),"ba");
      $line=133;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("b",'b'),"bb");
      $line=134;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("b",'c'),"bc");
      $line=136;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("c",'a'),"ca");
      $line=137;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("c",'b'),"cb");
      $line=138;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("c",'c'),"cc");
      $line=141;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("aa",'a'),"aaa");
      $line=142;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("aa",'b'),"aab");
      $line=143;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("aa",'c'),"aac");
      $line=145;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ab",'a'),"aba");
      $line=146;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ab",'b'),"abb");
      $line=147;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ab",'c'),"abc");
      $line=149;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ac",'a'),"aca");
      $line=150;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ac",'b'),"acb");
      $line=151;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ac",'c'),"acc");
      $line=153;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ba",'a'),"baa");
      $line=154;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ba",'b'),"bab");
      $line=155;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ba",'c'),"bac");
      $line=157;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bb",'a'),"bba");
      $line=158;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bb",'b'),"bbb");
      $line=159;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bb",'c'),"bbc");
      $line=161;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bc",'a'),"bca");
      $line=162;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bc",'b'),"bcb");
      $line=163;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bc",'c'),"bcc");
      $line=165;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ca",'a'),"caa");
      $line=166;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ca",'b'),"cab");
      $line=167;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ca",'c'),"cac");
      $line=169;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cb",'a'),"cba");
      $line=170;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cb",'b'),"cbb");
      $line=171;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cb",'c'),"cbc");
      $line=173;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cc",'a'),"cca");
      $line=174;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cc",'b'),"ccb");
      $line=175;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cc",'c'),"ccc");
      $line=177;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("aaa",'&'),"o");
      $line=178;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("aab",'&'),"o");
      $line=179;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("aac",'&'),"o");
      $line=181;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("aba",'&'),"o");
      $line=182;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("abb",'&'),"o");
      $line=183;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("abc",'&'),"o");
      $line=185;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("aca",'&'),"o");
      $line=186;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("acb",'&'),"o");
      $line=187;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("acc",'&'),"o");
      $line=189;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("baa",'&'),"o");
      $line=190;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bab",'&'),"o");
      $line=191;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bac",'&'),"o");
      $line=193;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bba",'&'),"o");
      $line=194;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bbb",'&'),"o");
      $line=195;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bbc",'&'),"o");
      $line=197;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bca",'&'),"o");
      $line=198;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bcb",'&'),"o");
      $line=199;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("bcc",'&'),"o");
      $line=201;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("caa",'&'),"o");
      $line=202;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cab",'&'),"o");
      $line=203;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cac",'&'),"o");
      $line=205;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cba",'&'),"o");
      $line=206;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cbb",'&'),"o");
      $line=207;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cbc",'&'),"o");
      $line=209;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("cca",'&'),"o");
      $line=210;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ccb",'&'),"o");
      $line=211;
      ((gold.structures.map.GHashTableMap)delta).put(GCollections.asList("ccc",'&'),"o");
      $line=214;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,O,"o",F,new GMethod(P2.class,"\u03B4"),new GMethod(P2.class,"g"),new GMethod(P2.class,"h")});
      if (true) break $try;
      $line=215;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"createCoder",$line);
    }
    return $cast(IAutomaton.class,$result);
  }
  public static Object g(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result=P2.x(s);
      if (true) break $try;
      $line=217;
      $rethrow(new RuntimeException("The function \"g(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"g",$line);
    }
    return $result;
  }
  public static Object \u03B4(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result=(($bool(((gold.structures.map.GHashTableMap)delta).containsKey(GCollections.asList(q,s))))?(((gold.structures.map.GHashTableMap)delta).get(GCollections.asList(q,s))):(0));
      if (true) break $try;
      $line=219;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result=(($bool(((gold.structures.map.GHashTableMap)outputT).containsKey(GCollections.asList(q,s))))?(((gold.structures.map.GHashTableMap)outputT).get(GCollections.asList(q,s))):(""));
      if (true) break $try;
      $line=220;
      $rethrow(new RuntimeException("The function \"h(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"h",$line);
    }
    return $result;
  }
  public static Object x(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=223;
      if ($opEqualY(s,"aaa")) {
        $line=224;
        if (!$opEqualY(P2.g("o"),"aaa")) {
          $line=225;
          $result="aaa";
          if (true) break $try;
        }
        else {
          $line=227;
          $result="*";
          if (true) break $try;
        }
      }
      else {
        $line=230;
        if ($opEqualY(s,"aab")) {
          $line=231;
          $result="baa";
          if (true) break $try;
        }
        else {
          $line=232;
          if ($opEqualY(s,"aac")) {
            $line=233;
            $result="caa";
            if (true) break $try;
          }
          else {
            $line=234;
            if ($opEqualY(s,"aba")) {
              $line=235;
              $result="aba";
              if (true) break $try;
            }
            else {
              $line=236;
              if ($opEqualY(s,"abb")) {
                $line=237;
                $result="bba";
                if (true) break $try;
              }
              else {
                $line=238;
                if ($opEqualY(s,"abc")) {
                  $line=239;
                  $result="cba";
                  if (true) break $try;
                }
                else {
                  $line=240;
                  if ($opEqualY(s,"aca")) {
                    $line=241;
                    $result="aca";
                    if (true) break $try;
                  }
                  else {
                    $line=242;
                    if ($opEqualY(s,"acb")) {
                      $line=243;
                      $result="bca";
                      if (true) break $try;
                    }
                    else {
                      $line=244;
                      if ($opEqualY(s,"acc")) {
                        $line=245;
                        $result="cca";
                        if (true) break $try;
                      }
                      else {
                        $line=246;
                        if ($opEqualY(s,"baa")) {
                          $line=247;
                          $result="aab";
                          if (true) break $try;
                        }
                        else {
                          $line=248;
                          if ($opEqualY(s,"bab")) {
                            $line=249;
                            $result="bab";
                            if (true) break $try;
                          }
                          else {
                            $line=250;
                            if ($opEqualY(s,"bac")) {
                              $line=251;
                              $result="cab";
                              if (true) break $try;
                            }
                            else {
                              $line=252;
                              if ($opEqualY(s,"bba")) {
                                $line=253;
                                $result="abb";
                                if (true) break $try;
                              }
                              else {
                                $line=254;
                                if ($opEqualY(s,"bbb")) {
                                  $line=255;
                                  $result="bbb";
                                  if (true) break $try;
                                }
                                else {
                                  $line=256;
                                  if ($opEqualY(s,"bbc")) {
                                    $line=257;
                                    $result="cbb";
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=258;
                                    if ($opEqualY(s,"bca")) {
                                      $line=259;
                                      $result="acb";
                                      if (true) break $try;
                                    }
                                    else {
                                      $line=260;
                                      if ($opEqualY(s,"bcb")) {
                                        $line=261;
                                        $result="bcb";
                                        if (true) break $try;
                                      }
                                      else {
                                        $line=262;
                                        if ($opEqualY(s,"bcc")) {
                                          $line=263;
                                          $result="ccb";
                                          if (true) break $try;
                                        }
                                        else {
                                          $line=264;
                                          if ($opEqualY(s,"caa")) {
                                            $line=265;
                                            $result="aac";
                                            if (true) break $try;
                                          }
                                          else {
                                            $line=266;
                                            if ($opEqualY(s,"cab")) {
                                              $line=267;
                                              $result="bac";
                                              if (true) break $try;
                                            }
                                            else {
                                              $line=268;
                                              if ($opEqualY(s,"cac")) {
                                                $line=269;
                                                $result="cac";
                                                if (true) break $try;
                                              }
                                              else {
                                                $line=270;
                                                if ($opEqualY(s,"cba")) {
                                                  $line=271;
                                                  $result="abc";
                                                  if (true) break $try;
                                                }
                                                else {
                                                  $line=272;
                                                  if ($opEqualY(s,"cbb")) {
                                                    $line=273;
                                                    $result="bbc";
                                                    if (true) break $try;
                                                  }
                                                  else {
                                                    $line=274;
                                                    if ($opEqualY(s,"cbc")) {
                                                      $line=275;
                                                      $result="cbc";
                                                      if (true) break $try;
                                                    }
                                                    else {
                                                      $line=276;
                                                      if ($opEqualY(s,"cca")) {
                                                        $line=277;
                                                        $result="acc";
                                                        if (true) break $try;
                                                      }
                                                      else {
                                                        $line=278;
                                                        if ($opEqualY(s,"ccb")) {
                                                          $line=279;
                                                          $result="bcc";
                                                          if (true) break $try;
                                                        }
                                                        else {
                                                          $line=280;
                                                          if ($opEqualY(s,"ccc")) {
                                                            $line=281;
                                                            $result="ccc";
                                                            if (true) break $try;
                                                          }
                                                          else {
                                                            $line=284;
                                                            $result="";
                                                            if (true) break $try;
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
              }
            }
          }
        }
      }
      $line=286;
      $rethrow(new RuntimeException("The function \"x(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"x",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=289;
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          for (Object pos:GCollections.unmodifiableCollection($opUnionY($opIntvlY(0,4),GCollections.asSet("_")))) {
            $v1.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object Q=$fix($opUnionY($v1,GCollections.asSet(3,2,5,"I","E")));
      $line=290;
      Object \u03A3_=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(':','2','3','5')));
      $line=291;
      Object \u03A3=$fix($opUnionY(\u03A3_,GCollections.asSet('#')));
      $line=292;
      Object q_0=$fix("I");
      $line=293;
      gold.structures.set.ISet $v3=$newSet();
      $v4:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          int $v5=$int(0);
          int $v6=$int(5)-1;
          for (int pos=$v5; pos<=$v6; pos++) {
            $v3.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object F=$fix($v3);
      $line=295;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(P2.class,"\u03B41"),new GMethod(P2.class,"g"),new GMethod(P2.class,"h1")});
      if (true) break $try;
      $line=296;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=302;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=302;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=303;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=303;
          $result=GCollections.asList(state,input,"_");
          if (true) break $try;
        }
        else {
          $line=304;
          $result="E";
          if (true) break $try;
        }
      }
      $line=306;
      $rethrow(new RuntimeException("The function \"\u03B41(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v7, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v8=GCollections.unmodifiableCollection($v7).iterator();
      Object d=$v8.next();
      Object s=$v8.next();
      Object pos=$v8.next();
      $line=309;
      if (($opEqualY(pos,"_")&&$opEqualY(input,':'))) {
        $line=309;
        $result=GCollections.asList(d,s,1);
        if (true) break $try;
      }
      else {
        $line=310;
        if ($opEqualY(pos,"_")) {
          $line=310;
          $result="E";
          if (true) break $try;
        }
        else {
          $line=311;
          if (($opEqualY(input,'#')&&!$opEqualY(pos,0))) {
            $line=311;
            $result="E";
            if (true) break $try;
          }
          else {
            $line=312;
            if (($opEqualY(input,s)&&$opEqualY(pos,0))) {
              $line=312;
              $result="E";
              if (true) break $try;
            }
            else {
              $line=313;
              if ($opMembrY(input,$opUnionY($opIntvlY('a','z'),GCollections.asSet('#')))) {
                $line=313;
                $result=GCollections.asList(d,s,$opModulY($opAdditY(pos,1),d));
                if (true) break $try;
              }
              else {
                $line=314;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=316;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8d,s,pos\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=322;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=322;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=323;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=323;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=324;
          $result="";
          if (true) break $try;
        }
      }
      $line=326;
      $rethrow(new RuntimeException("The function \"h1(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v9, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v10=GCollections.unmodifiableCollection($v9).iterator();
      Object d=$v10.next();
      Object s=$v10.next();
      Object pos=$v10.next();
      $line=329;
      if (($opEqualY(pos,"_")&&$opEqualY(input,':'))) {
        $line=329;
        $result=input;
        if (true) break $try;
      }
      else {
        $line=330;
        if (($opEqualY(input,'#')&&$opEqualY(pos,0))) {
          $line=330;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=331;
          if (($opMembrY(input,$opIntvlY('a','z'))&&$opEqualY(pos,1))) {
            $line=331;
            $result=P2.shiftSymbol(input,$opMinusY(d));
            if (true) break $try;
          }
          else {
            $line=332;
            if ($opMembrY(input,$opIntvlY('a','z'))) {
              $line=332;
              $result=input;
              if (true) break $try;
            }
            else {
              $line=333;
              $result="";
              if (true) break $try;
            }
          }
        }
      }
      $line=335;
      $rethrow(new RuntimeException("The function \"h1(\u27E8d,s,pos\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"h1",$line);
    }
    return $result;
  }
  public static Object shiftSymbol(Object symbol, Object shift) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=343;
      Character r=null;
      r=$defaultValue(Character.class);
      $line=345;
      if ($opMembrY(symbol,$opIntvlY('a','z'))) {
        $line=346;
        r=$cast(Character.class,$fix($opAdditY('a',$opModulY($opAdditY($opSubtrY(symbol,'a'),shift),26))));
      }
      else {
        $line=347;
        if ($opMembrY(symbol,$opIntvlY('A','Z'))) {
          $line=348;
          r=$cast(Character.class,$fix($opAdditY('A',$opModulY($opAdditY($opSubtrY(symbol,'A'),shift),26))));
        }
        else {
          $line=349;
          if ($opMembrY(symbol,$opIntvlY('0','9'))) {
            $line=350;
            r=$cast(Character.class,$fix($opAdditY('0',$opModulY($opAdditY($opSubtrY(symbol,'0'),shift),10))));
          }
          else {
            $line=351;
            r=$cast(Character.class,$fix(r));
          }
        }
      }
      $line=353;
      $result=r;
      if (true) break $try;
      $line=354;
      $rethrow(new RuntimeException("The function \"shiftSymbol(symbol:Object,shift:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"shiftSymbol",$line);
    }
    return $result;
  }
}
