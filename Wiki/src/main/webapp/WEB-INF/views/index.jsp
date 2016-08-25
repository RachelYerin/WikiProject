<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Wiki Project" />
<meta name="keywords" content="menu, navigation, animation, transition, transform, rotate, css3, web design, component, icon, slide" />
<meta name="author" content="Codrops" />

<title>Team 2 : Wiki Project</title>
</head>
<body>
<jsp:include page="header.jsp" flush="true" />
<table>
<tr><td>

   <div class="mw-body" id="content" role="main">
      <a id="top"></a>

      <div class="mw-indicators"></div>
      <h1 class="firstHeading" id="firstHeading" lang="en">Today's Wiki</h1>

      <div class="mw-body-content" id="bodyContent">
         <div id="siteSub">From ArchWiki</div>
         <div id="contentSub"></div>
         <div class="mw-jump" id="jump-to-nav">
            Jump to: <a href="#column-one">navigation</a>, <a
               href="#searchInput">search</a>
         </div>

         <!-- start content -->
         <div class="mw-content-ltr" id="mw-content-text" lang="en" dir="ltr">
            <p>
               <b>Welcome to the <a title="ArchWiki:About"
                  href="/index.php/ArchWiki:About">ArchWiki</a>: your source for
                  Arch Linux documentation on the web.
               </b>
            </p>
            <p>
               Visit the <a title="Table of contents"
                  href="/index.php/Table_of_contents">Table of contents</a> for a
               listing of article categories.
            </p>
            <h2>
               <span class="mw-headline" id="The_distribution">The
                  distribution</span>
            </h2>
            <div style="width: 49%; margin-right: 1%; float: left;">
               <dl>
                  <dt>
                     <a title="Arch Linux" href="/index.php/Arch_Linux">Arch Linux</a>
                  </dt>
                  <dd>Overview of Arch Linux describing what to expect from an
                     Arch Linux system.</dd>
               </dl>
               <dl>
                  <dt>
                     <a title="Frequently asked questions"
                        href="/index.php/Frequently_asked_questions">Frequently
                        asked questions</a>
                  </dt>
                  <dd>Notable questions and facts about the distribution.</dd>
               </dl>
               <dl>
                  <dt>
                     <a title="Arch compared to other distributions"
                        href="/index.php/Arch_compared_to_other_distributions">Arch
                        compared to other distributions</a>
                  </dt>
                  <dd>Summarizes the similarities and differences between Arch
                     and other distributions.</dd>
               </dl>
            </div>
            <div style="width: 50%; float: left;">
               <dl>
                  <dt>
                     <a title="Installation guide"
                        href="/index.php/Installation_guide">Installation guide</a>
                  </dt>
                  <dd>Guide through the process of installing Arch Linux.</dd>
               </dl>
               <dl>
                  <dt>
                     <a title="General recommendations"
                        href="/index.php/General_recommendations">General
                        recommendations</a>
                  </dt>
                  <dd>Annotated index of post-installation tutorials and other
                     popular articles.</dd>
               </dl>
               <dl>
                  <dt>
                     <a title="List of applications"
                        href="/index.php/List_of_applications">List of applications</a>
                  </dt>
                  <dd>Categorized presentation of common official and AUR
                     packages.</dd>
               </dl>
            </div>
            <div style="clear: both;"></div>
            <h2>
               <span class="mw-headline" id="Our_community">Our community</span>
            </h2>
            <div style="width: 49%; margin-right: 1%; float: left;">
               <dl>
                  <dt>
                     <a title="Code of conduct" href="/index.php/Code_of_conduct">Code
                        of conduct</a>
                  </dt>
                  <dd>Guidelines for the Arch community.</dd>
               </dl>
               <dl>
                  <dt>
                     <a title="Getting involved" href="/index.php/Getting_involved">Getting
                        involved</a>
                  </dt>
                  <dd>Describes various ways Archers can contribute to the Arch
                     community.</dd>
               </dl>
               <dl>
                  <dt>
                     <a title="ArchWiki:Contributing"
                        href="/index.php/ArchWiki:Contributing">ArchWiki:Contributing</a>
                  </dt>
                  <dd>If willing and able to contribute to the wiki, please see
                     this article for ideas.</dd>
               </dl>
            </div>
            <div style="width: 50%; float: left;">
               <dl>
                  <dt>
                     <a title="Help:Editing" href="/index.php/Help:Editing">Help:Editing</a>
                  </dt>
                  <dd>Short tutorial on editing and contributing to the Arch
                     Linux wiki.</dd>
               </dl>
               <dl>
                  <dt>
                     <a title="International communities"
                        href="/index.php/International_communities">International
                        communities</a>
                  </dt>
                  <dd>Collection of links to the Arch Linux communities around
                     the world.</dd>
               </dl>
               <dl>
                  <dt>
                     <a title="IRC channels" class="mw-redirect"
                        href="/index.php/IRC_channels">IRC channels</a>
                  </dt>
                  <dd>Get together with your fellow Archers for a good chat.</dd>
               </dl>
            </div>
            <div style="clear: both;"></div>
            <h2>
               <span class="mw-headline" id="Help">Help</span>
            </h2>
            <p>
               ArchWiki pages follow specific conventions, so if you have trouble
               reading ArchWiki or understanding some instructions, see <a
                  title="Help:Reading" href="/index.php/Help:Reading">Help:Reading</a>
               for a clarification.
            </p>
            <p>
               If looking for specific information, try using the search box to
               the left. Alternatively, use your favorite web search engine which
               likely provides a special syntax or interface for restricting
               results to a particular website (usually appending
               <code>site:wiki.archlinux.org</code>
               to the search terms is enough). See <a title="Help:Searching"
                  href="/index.php/Help:Searching">Help:Searching</a> for other
               tricks.
            </p>
         </div>
         <div class="printfooter">
            Retrieved from "<a dir="ltr"
               href="https://wiki.archlinux.org/index.php?title=Main_page&amp;oldid=447556">https://wiki.archlinux.org/index.php?title=Main_page&amp;oldid=447556</a>"
         </div>
         <div class="catlinks" id="catlinks">
            <div class="mw-normal-catlinks" id="mw-normal-catlinks">
               <a title="Special:Categories" href="/index.php/Special:Categories">Category</a>:
               <ul>
                  <li><a title="Category:English"
                     href="/index.php/Category:English">English</a></li>
               </ul>
            </div>
         </div>
         <!-- end content -->
         <div class="visualClear"></div>
      </div>
   </div>
</td></tr></table>
</body>
</html>